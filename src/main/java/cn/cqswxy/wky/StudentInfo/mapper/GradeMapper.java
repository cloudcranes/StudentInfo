package cn.cqswxy.wky.StudentInfo.mapper;

import cn.cqswxy.wky.StudentInfo.pojo.Grade;

import java.util.List;
import java.util.Map;

public interface GradeMapper {
    /**
     * 添加成绩
     * //     * @param grand   成绩
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
    List<Grade> getEedCourseBySid(Map<String, Object> data);

}
