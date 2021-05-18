package cn.cqswxy.wky.StudentInfo.service;

import cn.cqswxy.wky.StudentInfo.pojo.SC;
import cn.cqswxy.wky.StudentInfo.pojo.StuExitSelect;
import cn.cqswxy.wky.StudentInfo.pojo.StuSelectResult;
import cn.cqswxy.wky.StudentInfo.pojo.Student;

import java.util.List;


public interface SelectCourseService {

    /**
     * 选课
     *
     * @return 选课结果
     */
    int selectCourse(String cid, String sid);

    /**
     * 判断是否加入过此课程
     *
     * @param cid 课程编号
     * @param sid 学号
     * @return
     */
    String existCourse(String cid, String sid);

    /**
     * 查询全部
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param sid      学号
     * @return 查询结果
     */
    List<SC> getAllSC(int pageNo, int pageSize, String sid);

    /**
     * 根据课程编号查询课程选课信息
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param cid      课程编号
     * @return 查询结果
     */
    List<SC> getSCByCid(int pageNo, int pageSize, String cid);

    /**
     * 根据学号查询本人已选课程
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param sid      学号
     * @return 查询结果
     */
    List<StuSelectResult> getSCBySid(int pageNo, int pageSize, String sid);

    /**
     * 根据学号退选（待确定··）
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param sid      学号
     * @return 查询结果
     */
    List<StuExitSelect> getExitBysid(int pageNo, int pageSize, String sid);

    /**
     * 退选
     *
     * @param cid
     * @return
     */
    int deleteSC(String cid, String sid);

    /**
     * 查看课程已选人数
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param tid      教师编号
     * @return
     */
    List<StuExitSelect> getLookByTid(int pageNo, int pageSize, String tid);

    /**
     * 查看课程的学生详细信息
     *
     * @param pageNo   起始条
     * @param pageSize 终止条
     * @param cid      课程编号
     * @return
     */
    List<Student> getByStuSid(int pageNo, int pageSize, String cid);

}
