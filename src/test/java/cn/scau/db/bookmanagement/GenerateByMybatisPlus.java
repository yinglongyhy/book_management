package cn.scau.db.bookmanagement;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

public class GenerateByMybatisPlus {

    @Test
    public void generate() {
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("yinglongyhy")
                .setOutputDir("./src/main/java")
                .setOpen(false)
                .setSwagger2(true)
                .setControllerName("%sRestController")
                .setBaseResultMap(true);

        DataSourceConfig dc = new DataSourceConfig();
        dc.setDbType(DbType.MYSQL)
                .setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://localhost:3308/book_management?useUnicode=true&characterEncoding=utf-8")
                .setUsername("root")
                .setPassword("root");

        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.scau.db.bookmanagement")
                .setController("rest")
                .setMapper("mapper")
                .setXml("mapper.xml");

        StrategyConfig sc = new StrategyConfig();
        sc.setNaming(NamingStrategy.underline_to_camel)
                .setColumnNaming(NamingStrategy.underline_to_camel)
//                .setTablePrefix("tbl_")
                .setRestControllerStyle(true);


        new AutoGenerator().setGlobalConfig(gc)
                .setDataSource(dc)
                .setPackageInfo(pc)
                .setStrategy(sc)
                .setTemplateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
