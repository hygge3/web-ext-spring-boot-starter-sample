package ext.library;

import ext.library.mybatis.codegen.Codegen;
import ext.library.mybatis.codegen.GenerateConfig;

import java.util.Set;

public class CodegenUtil {
    public static void main(String[] args) {
        GenerateConfig generateConfig = new GenerateConfig("jdbc:mysql://rm-j6c5ac872mg26lc86co.mysql.rds.aliyuncs.com/sample", "developer", "aPrJ5xNQbs&um", "ext.library", Set.of("t_user"));
        generateConfig.setTablePrefix("t_");
        generateConfig.setLargeColumns(Set.of("remark"));
        generateConfig.setAddCacheExample(true);
        Codegen.generate(generateConfig);
    }
}
