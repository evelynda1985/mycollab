/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
/*Domain class of table m_prj_problem*/
package com.esofthead.mycollab.module.project.domain;

import com.esofthead.mycollab.core.arguments.ValuedBean;
import java.util.Date;

@SuppressWarnings("ucd")
@com.esofthead.mycollab.core.db.metadata.Table("m_prj_problem")
public class Problem extends ValuedBean {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.id
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("id")
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.issuename
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=400, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("issuename")
    private String issuename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.projectid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("projectid")
    private Integer projectid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.raisedbyuser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("raisedbyuser")
    private String raisedbyuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.assigntouser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("assigntouser")
    private String assigntouser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.impact
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("impact")
    private String impact;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.priority
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("priority")
    private String priority;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.status
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("status")
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.dateraised
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("dateraised")
    private Date dateraised;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.datedue
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("datedue")
    private Date datedue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.actualstartdate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("actualstartdate")
    private Date actualstartdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.actualenddate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("actualenddate")
    private Date actualenddate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.level
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("level")
    private Double level;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.resolution
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=4000, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("resolution")
    private String resolution;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.state
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("state")
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.problemsource
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("problemsource")
    private String problemsource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.createdTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("createdTime")
    private Date createdtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.lastUpdatedTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("lastUpdatedTime")
    private Date lastupdatedtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.type
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=45, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("type")
    private String type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.typeid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("typeid")
    private Integer typeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.sAccountId
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("sAccountId")
    private Integer saccountid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.prjKey
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @com.esofthead.mycollab.core.db.metadata.Column("prjKey")
    private Integer prjkey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_prj_problem.description
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    @org.hibernate.validator.constraints.Length(max=65535, message="Field value is too long")
    @com.esofthead.mycollab.core.db.metadata.Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.id
     *
     * @return the value of m_prj_problem.id
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.id
     *
     * @param id the value for m_prj_problem.id
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.issuename
     *
     * @return the value of m_prj_problem.issuename
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getIssuename() {
        return issuename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.issuename
     *
     * @param issuename the value for m_prj_problem.issuename
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setIssuename(String issuename) {
        this.issuename = issuename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.projectid
     *
     * @return the value of m_prj_problem.projectid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Integer getProjectid() {
        return projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.projectid
     *
     * @param projectid the value for m_prj_problem.projectid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.raisedbyuser
     *
     * @return the value of m_prj_problem.raisedbyuser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getRaisedbyuser() {
        return raisedbyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.raisedbyuser
     *
     * @param raisedbyuser the value for m_prj_problem.raisedbyuser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setRaisedbyuser(String raisedbyuser) {
        this.raisedbyuser = raisedbyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.assigntouser
     *
     * @return the value of m_prj_problem.assigntouser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getAssigntouser() {
        return assigntouser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.assigntouser
     *
     * @param assigntouser the value for m_prj_problem.assigntouser
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setAssigntouser(String assigntouser) {
        this.assigntouser = assigntouser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.impact
     *
     * @return the value of m_prj_problem.impact
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getImpact() {
        return impact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.impact
     *
     * @param impact the value for m_prj_problem.impact
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setImpact(String impact) {
        this.impact = impact;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.priority
     *
     * @return the value of m_prj_problem.priority
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getPriority() {
        return priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.priority
     *
     * @param priority the value for m_prj_problem.priority
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setPriority(String priority) {
        this.priority = priority;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.status
     *
     * @return the value of m_prj_problem.status
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.status
     *
     * @param status the value for m_prj_problem.status
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.dateraised
     *
     * @return the value of m_prj_problem.dateraised
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getDateraised() {
        return dateraised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.dateraised
     *
     * @param dateraised the value for m_prj_problem.dateraised
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setDateraised(Date dateraised) {
        this.dateraised = dateraised;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.datedue
     *
     * @return the value of m_prj_problem.datedue
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getDatedue() {
        return datedue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.datedue
     *
     * @param datedue the value for m_prj_problem.datedue
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setDatedue(Date datedue) {
        this.datedue = datedue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.actualstartdate
     *
     * @return the value of m_prj_problem.actualstartdate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getActualstartdate() {
        return actualstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.actualstartdate
     *
     * @param actualstartdate the value for m_prj_problem.actualstartdate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setActualstartdate(Date actualstartdate) {
        this.actualstartdate = actualstartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.actualenddate
     *
     * @return the value of m_prj_problem.actualenddate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getActualenddate() {
        return actualenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.actualenddate
     *
     * @param actualenddate the value for m_prj_problem.actualenddate
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setActualenddate(Date actualenddate) {
        this.actualenddate = actualenddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.level
     *
     * @return the value of m_prj_problem.level
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Double getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.level
     *
     * @param level the value for m_prj_problem.level
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setLevel(Double level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.resolution
     *
     * @return the value of m_prj_problem.resolution
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.resolution
     *
     * @param resolution the value for m_prj_problem.resolution
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.state
     *
     * @return the value of m_prj_problem.state
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.state
     *
     * @param state the value for m_prj_problem.state
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.problemsource
     *
     * @return the value of m_prj_problem.problemsource
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getProblemsource() {
        return problemsource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.problemsource
     *
     * @param problemsource the value for m_prj_problem.problemsource
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setProblemsource(String problemsource) {
        this.problemsource = problemsource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.createdTime
     *
     * @return the value of m_prj_problem.createdTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.createdTime
     *
     * @param createdtime the value for m_prj_problem.createdTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.lastUpdatedTime
     *
     * @return the value of m_prj_problem.lastUpdatedTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Date getLastupdatedtime() {
        return lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.lastUpdatedTime
     *
     * @param lastupdatedtime the value for m_prj_problem.lastUpdatedTime
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setLastupdatedtime(Date lastupdatedtime) {
        this.lastupdatedtime = lastupdatedtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.type
     *
     * @return the value of m_prj_problem.type
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.type
     *
     * @param type the value for m_prj_problem.type
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.typeid
     *
     * @return the value of m_prj_problem.typeid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Integer getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.typeid
     *
     * @param typeid the value for m_prj_problem.typeid
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.sAccountId
     *
     * @return the value of m_prj_problem.sAccountId
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.sAccountId
     *
     * @param saccountid the value for m_prj_problem.sAccountId
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.prjKey
     *
     * @return the value of m_prj_problem.prjKey
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public Integer getPrjkey() {
        return prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.prjKey
     *
     * @param prjkey the value for m_prj_problem.prjKey
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setPrjkey(Integer prjkey) {
        this.prjkey = prjkey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_prj_problem.description
     *
     * @return the value of m_prj_problem.description
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_prj_problem.description
     *
     * @param description the value for m_prj_problem.description
     *
     * @mbggenerated Mon May 04 10:52:58 ICT 2015
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public static enum Field {
        id,
        issuename,
        projectid,
        raisedbyuser,
        assigntouser,
        impact,
        priority,
        status,
        dateraised,
        datedue,
        actualstartdate,
        actualenddate,
        level,
        resolution,
        state,
        problemsource,
        createdtime,
        lastupdatedtime,
        type,
        typeid,
        saccountid,
        prjkey,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}