package cn.cqswxy.wky.StudentInfo.service.impl;

import cn.cqswxy.wky.StudentInfo.mapper.GradeMapper;
import cn.cqswxy.wky.StudentInfo.pojo.Grade;
import cn.cqswxy.wky.StudentInfo.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    @Override
    public int insertGrade(Grade grade) {

        return gradeMapper.insertGrade(grade);
    }

    @Override
    public String queryCreditsSum(String sid) {
        return gradeMapper.queryCreditsSum(sid);
    }

    @Override
    public List<Grade> getEedCourseBySid(int pageNo, int pageSize, String sid) {
        Map<String, Object> data = new HashMap<String, Object>();
        data.put("pageNo", (pageNo - 1) * pageSize);
        data.put("pageSize", pageSize);
        data.put("sid", sid);
        return gradeMapper.getEedCourseBySid(data);
    }

}
