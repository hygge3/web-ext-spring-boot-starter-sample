package ext.library;

import ext.library.mybatis.codegen.Codegen;
import ext.library.mybatis.codegen.GenerateConfig;

import java.util.Set;

public class CodegenUtil {
    public static void main(String[] args) {
        GenerateConfig generateConfig = new GenerateConfig();
        generateConfig.setJdbcUrl("jdbc:mysql://127.0.0.1:3306/sample");
        generateConfig.setUsername("root");
        generateConfig.setPassword("123456");
        generateConfig.setBasePackage("ext.library");
        generateConfig.setGenerateTables(Set.of("user"));
        generateConfig.setLargeColumns(Set.of("remark"));
        Codegen.generate(generateConfig);
    }
}