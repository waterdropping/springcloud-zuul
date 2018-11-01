### Demo for Zuul

#### 运行本示例的步骤

 * 启动SpringCloud-Eureka服务
 * 启动SpringCloud-Zuul服务
 * 启动SpringCloud-Server-1
 * 在浏览器中输入　http://localhost:8083/service/info, 直接访问服务的端口号，可以得到结果
 * 在浏览器中输入  http://localhost:8080/myservice/service/info, 访问Zuul的服务端口号，后接服务的名称，再接服务的API url，　可以得到结果

#### 在Zuul中增加filter
 * 启动SpringCloud-Eureka服务
 * 启动SpringCloud-Zuul-With-Filter服务
 * 启动SpringCloud-Server-1
 * 在浏览器中输入  http://localhost:8080/myservice/service/info?credit=200, 结果得到“Invalid credit value.” 
 * 在浏览器中输入  http://localhost:8080/myservice/service/info?credit=１０00, 结果得到“Service is available, port=8083”
