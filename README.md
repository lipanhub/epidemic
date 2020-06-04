# 学生健康登记系统

## 部署
1. 确保本地装有mysql,创建一个名为epidemic的数据库
```sql
create database epidemic;
```
2. 在application.properties文件下修改关于数据库的配置
```yaml
# 数据库账号
spring.datasource.username=root
# 数据库密码
spring.datasource.password=1366lipan
```
3. 确保本地装有java环境,执行以下命令启动项目
```shell
java -jar epidemic-0.0.1-SNAPSHOT.jar
```
4. 打开浏览器,通过以下url访问主页
```html
http://localhost:8888/
```