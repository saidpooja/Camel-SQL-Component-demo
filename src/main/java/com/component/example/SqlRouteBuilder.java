package com.component.example;

import javax.sql.DataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

public class SqlRouteBuilder extends RouteBuilder{
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void configure() throws Exception {
		
		/*from("timer:sqlStartTime?delay=1000")
		.to("sql:select * from employee?dataSource=#dataObject")
		.process(new Processor() {
			
			@Override
			public void process(Exchange exchange) throws Exception {
				String obj = exchange.getIn().getBody(String.class);
				System.out.println("obj::: "+obj);
			}
		});
		
		
		from("timer:sqlStartTime?delay=1000")
		 .setHeader("empId", constant(7))
	     .setHeader("name", constant("Shubhangi"))
	     .setHeader("address1", constant("Runwal"))
	     .setHeader("address2", constant("Dombivali"))
	     .setHeader("designation", constant("Beautician"))
	     .setHeader("city", constant("Mumbai"))
	     .setHeader("deprtment", constant("M.Com"))
		.to("sql:INSERT INTO EMPLOYEE VALUES (:#empId, :#name, :#address1, :#address2, :#designation, :#city, :#deprtment)?dataSource=#dataObject")
		.process(new Processor() {
					@Override
					public void process(Exchange exchange) throws Exception {
						
						String obj = exchange.getIn().getBody(String.class);
						
						System.out.println("obj::: "+obj);
						
						int countRow = (int) exchange.getIn().getHeader("CamelSqlUpdateCount");
						
						System.out.println("countRow: "+ countRow);
					}
				});*/
		
		
		
		
		
	}

}

