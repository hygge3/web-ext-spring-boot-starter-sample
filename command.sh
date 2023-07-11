# smart-doc 文档使用

# 生成html
mvn -Dfile.encoding=UTF-8 smart-doc:html
# 生成markdown
mvn -Dfile.encoding=UTF-8 smart-doc:markdown
# 生成adoc
mvn -Dfile.encoding=UTF-8 smart-doc:adoc
# 生成postman json数据
mvn -Dfile.encoding=UTF-8 smart-doc:postman
# 生成 Open Api 3.0+,Since smart-doc-maven-plugin 1.1.5
mvn -Dfile.encoding=UTF-8 smart-doc:openapi
# 生成文档推送到Torna平台
mvn -Dfile.encoding=UTF-8 smart-doc:torna-rest