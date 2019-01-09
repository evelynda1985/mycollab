package com.mycollab.common.dao;

import com.mycollab.common.domain.CustomViewStore;
import com.mycollab.common.domain.CustomViewStoreExample;
import com.mycollab.db.persistence.ICrudGenericDAO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface CustomViewStoreMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    long countByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int deleteByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int insert(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int insertSelective(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    List<CustomViewStore> selectByExampleWithBLOBs(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    List<CustomViewStore> selectByExample(CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    CustomViewStore selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByExampleSelective(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByExampleWithBLOBs(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByExample(@Param("record") CustomViewStore record, @Param("example") CustomViewStoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByPrimaryKeySelective(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByPrimaryKeyWithBLOBs(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    int updateByPrimaryKey(CustomViewStore record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    Integer insertAndReturnKey(CustomViewStore value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_table_customize_view
     *
     * @mbg.generated Wed Jan 09 17:30:11 CST 2019
     */
    void massUpdateWithSession(@Param("record") CustomViewStore record, @Param("primaryKeys") List primaryKeys);
}