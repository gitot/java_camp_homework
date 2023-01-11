# 作业说明


### 使用G1收集器启动程序，然后使用工具分析内存情况
本地启动 gateway-server-0.0.1-SNAPSHOT.jar jar程序，使用如下命令启动。

`
java -XX:+UseG1GC -jar gateway-server-0.0.1-SNAPSHOT.jar
`

使用jmap,在mac无法使用。 降级使用'kill -3 pid' 分析jvm进程堆栈信息。
然后使用了jstack，dump了堆栈信息。
jconsole，查看了jvm的各个方面的运行状况。