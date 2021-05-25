package cn.wr516.admin;

import cn.pinming.core.service.permission.access.DataAccessRange;
import cn.pinming.core.service.permission.annotation.Permission;
import cn.pinming.core.service.permission.annotation.Range;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class Test {

    public static void main(String[] args) {
        WorkerQuery workerQuery = new WorkerQuery();
        workerQuery.setCompany_id(10795);
        workerQuery.setMemberId("2c908ab96661b380016661b62c340007");
        SpringApplication.run(Test.class, args);
        run(workerQuery,null);
    }
    @Permission(functionCode = "c_subcontract_browse", type = Permission.PermissionType.COMPANY_PERMISSION,
            mid = "#query.memberId", typeId = "#query.company_id"
    )
    private static void run (@Range WorkerQuery query, DataAccessRange dataAccessRange){
        System.out.println(123);
        System.out.println(query);
    }
}
