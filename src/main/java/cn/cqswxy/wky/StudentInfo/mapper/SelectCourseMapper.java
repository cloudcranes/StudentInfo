package cn.cqswxy.wky.StudentInfo.mapper;

import cn.cqswxy.wky.StudentInfo.pojo.SC;
import cn.cqswxy.wky.StudentInfo.pojo.StuExitSelect;
import cn.cqswxy.wky.StudentInfo.pojo.StuSelectResult;
import cn.cqswxy.wky.StudentInfo.pojo.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface SelectCourseMapper {

    /**
     * 选课
     *
     * @return 选课结果
     */
    int selectCourse(@Param("cid") String cid, @Param("sid") String sid);

    /**
     * 判断是否加入过此课程
     *
     * @param cid 课程编号
     * @param sid 学号
     * @return
     */
    String existCourse(@Param("cid") String cid, @Param("sid") String sid);

    /**
     * 查询全部
     *
     * @param data
     * @return 查询结果
     */
    List<SC> getAllSC(Map<String, Object> data);

    /**
     * 根据课程编号查询课程选课信息
     *
     * @param data
     * @return 查询结果
     */
    List<SC> getSCByCid(Map<String, Object> data);

    /**
     * 根据学号查询本人已选课程
     *
     * @param data
     * @return 查询结果
     */
    List<StuSelectResult> getSCBySid(Map<String, Object> data);

    /**
     * 根据学号退选（待确定··）
     *
     * @param data
     * @return 查询结果
     */
    List<StuExitSelect> getExitBysid(Map<String, Object> data);

    /**
     * 退选
     *
     * @param cid
     * @return
     */
    int deleteSC(@Param("cid") String cid, @Param("sid") String sid);

    /**
     * 查看课程已选人数
     *
     * @param data
     * @return
     */
    List<StuExitSelect> getLookByTid(Map<String, Object> data);

    /**
     * 查看课程的学生详细信息
     *
     * @param data
     * @return
     */
    List<Student> getByStuSid(Map<String, Object> data);

}
