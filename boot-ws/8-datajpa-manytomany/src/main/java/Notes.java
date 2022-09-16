
public class Notes {

/**
  
    Spring recommends HikariCP for its performance. On the other hand, it also supports Tomcat and Commons DBCP2 in Spring Boot autoconfigured applications.
	It tries to use the HikariCP. If it isn't available, then tries to use the Tomcat pooling. If neither of those is available, then it tries to use Commons DBCP2.

	We can also specify the connection pool to use. In that case, we just need to add a new property to our application.properties file:

	spring.datasource.type=org.apache.tomcat.jdbc.pool.DataSource
	
	If we need to configure specific settings, we have available their prefixes:

	spring.datasource.hikari.* for HikariCP configuration
	spring.datasource.tomcat.* for Tomcat pooling configuration
	spring.datasource.dbcp2.* for Commons DBC2 configuration
	
	And, actually, we can set spring.datasource.type to any other DataSource implementation. It isn't necessary to be any of the three mentioned above.
 
 */

}
