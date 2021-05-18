package cn.cqswxy.wky.StudentInfo.service;

import cn.cqswxy.wky.StudentInfo.pojo.Teacher;

import java.util.List;


public interface TeacherService {

    /**
     * 添加教师
     *
     * @param teacher 学生教师
     * @return 插入结果 !=0则插入成功
     */
    int insertTeacher(Teacher teacher);

    /**
     * 根据教师编号删除教师信息
     *
     * @param tid 教师编号
     * @return 删除结果，!=0则删除成功
     */
    int deleteTeacher(String tid);

    /**
     * 修改教师信息
     *
     * @param teacher 教师信息
     * @return 修改结果 !=0则修改成功
     */
    int modifyTeacher(Teacher teacher);

    /**
     * 修改教师密码
     *
     * @param tpassword 修改后的密码
     * @param tid       查询条件教师编号
     * @return 修改结果 !=0则修改成功
     */
    int modifyTeacherPwd(String tpassword, String tid);

    /**
     * 根据教师编号查询出教师实体
     *
     * @param tid
     * @return
     */
    Teacher getByTeaTid(String tid);

    /**
     * 教师登录设置
     *
     * @param tid 教师编号（唯一）
     * @param pwd 密码
     * @return
     */
    String queryByNamePwd(String tid, String pwd);

    /*
     * sql后加limit实现分页
     * 查询全部教师
     * */
    List<Teacher> selectTeacherBySql(int pageNo, int pageSize);

    /**
     * 根据教师编号查询教师信息
     *
     * @param pageNo
     * @param pageSize
     * @return 查询结果
     */
    List<Teacher> getByTeacherTid(int pageNo, int pageSize, String tid);

    /**
     * ajax验证教师是否存在
     *
     * @param tid 教师编号
     * @return 结果
     */
    String ajaxQueryByTid(String tid);


}
