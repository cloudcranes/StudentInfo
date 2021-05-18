package cn.cqswxy.wky.StudentInfo.service;

import cn.cqswxy.wky.StudentInfo.pojo.Grade;

import java.util.List;

public interface GradeService {

    /**
     * 添加成绩
     * <p>
     * *@param grand 成绩
     *
     * @return 插入结果 !=0则插入成功
     */
    int insertGrade(Grade grade);

    /**
     * 查询学生自己的总学分
     */
    String queryCreditsSum(String sid);

    /**
     * 学生查看本人已修改课程
     */
    List<Grade> getEedCourseBySid(int pageNo, int pageSize, String sid);

}
