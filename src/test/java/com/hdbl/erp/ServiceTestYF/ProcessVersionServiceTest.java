package com.hdbl.erp.ServiceTestYF;

import com.hdbl.erp.entity.ProcessHourBean;
import com.hdbl.erp.entity.ProcessSequenceBean;
import com.hdbl.erp.entity.ProcessVersionBean;
import com.hdbl.erp.service.ProcessVersionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class ProcessVersionServiceTest {

    @Autowired
    ProcessVersionService processVersionService;

    @Test
    void testAddNewProcessVersion(){
        List<ProcessHourBean> processHourList;
        List<ProcessSequenceBean> processSequenceList;
        ProcessVersionBean processVersion = new ProcessVersionBean(1,1,"V1",1);
        processSequenceList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ProcessSequenceBean processSequenceBean = new ProcessSequenceBean(1,1,"n",1,"j",1,1,true);
            processHourList = new ArrayList<>();
            processHourList.add(new ProcessHourBean(1,"sf","sdf",1,1));
            processHourList.add(new ProcessHourBean(1,"sf","sdf",1,1));
            processSequenceBean.setProcessHourList(processHourList);
            processSequenceList.add(processSequenceBean);
        }
        processVersion.setProcessSequenceList(processSequenceList);
        System.out.println(processVersion);
        processVersionService.addNewProcessVersion(processVersion);
    }


    @Test
    void testSubmitProcess(){
        System.out.println(processVersionService.submitProcess(4,2));
    }

    @Test
    void testRemoveProcessVersion(){
        System.out.println(processVersionService.removeProcessVersion(2));
    }
}
