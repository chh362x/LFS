package com.lis.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/12/15.
 */
@Entity
@Table(name = "f_k_ybxx", schema = "dbo", catalog = "lisdb")
public class LisFKYbxxEntity {
    private Integer id;
    private Integer ybbh;
    private String ybid;
    private String brlb;
    private String byh;
    private String brxm;
    private String brxb;
    private String brnl;
    private String nllx;
    private String brkb;
    private String brch;
    private String bbzl;
    private Timestamp cyrq;
    private Timestamp fsrq;
    private Timestamp djrq;
    private Timestamp cdrq;
    private String sjys;
    private String jyys;
    private String shys;
    private String jymd;
    private String jymdmc;
    private Timestamp bgrq;
    private String ybzt;
    private String sfzt;
    private BigDecimal ybsf;
    private Integer gzl;
    private String jbh;
    private String beizhu;
    private Timestamp lastmodify;
    private Integer brxz;
    private String brxh;
    private String srys;
    private String bgys;
    private String sendzt;
    private String brbq;
    private String khks;
    private String printcs;
    private Integer rkbz;
    private BigDecimal zkybsf;
    private String bljchao;
    private String yyyzh;
    private String bz;
    private String qcljs;
    private String yytm;
    private Timestamp crowdatetime;
    private String keyid;
    private String xmstring;
    private String ptype;
    private String operator;
    private Integer qrbz;
    private String clientdes;
    private String itemdes;
    private String isxxzx;
    private Integer confirmstatus;
    private String qrry;
    private Timestamp qrsj;
    private String eqrry;
    private Timestamp eqrsj;
    private String qrzt;
    private String eqrzt;
    private Integer csqr;
    private String cardno;
    private String pnameen;
    private Timestamp recievetime;
    private String patientid;
    private Short recieveerror;
    private String remark;
    private String patienttype;
    private String projcode;
    private Integer pageno;
    private Integer pagexh;
    private String recieveman;
    private String bbxz;
    private Timestamp csrq;
    private Integer ismodified;
    private String testTypeNo;
    private Timestamp collectDateTime;
    private String xxly;
    private String yydm;
    private String tjbh;
    private BigDecimal sfje;
    private BigDecimal zk;
    private BigDecimal jmje;
    private BigDecimal sjje;
    private BigDecimal zkje;
    private String lczd1;
    private String lczd2;
    private String lczd;
    private Byte ptflag;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ybbh", nullable = false)
    public Integer getYbbh() {
        return ybbh;
    }

    public void setYbbh(Integer ybbh) {
        this.ybbh = ybbh;
    }

    @Basic
    @Column(name = "ybid", nullable = false, length = 12)
    public String getYbid() {
        return ybid;
    }

    public void setYbid(String ybid) {
        this.ybid = ybid;
    }

    @Basic
    @Column(name = "brlb", nullable = true, length = 10)
    public String getBrlb() {
        return brlb;
    }

    public void setBrlb(String brlb) {
        this.brlb = brlb;
    }

    @Basic
    @Column(name = "byh", nullable = true, length = 100)
    public String getByh() {
        return byh;
    }

    public void setByh(String byh) {
        this.byh = byh;
    }

    @Basic
    @Column(name = "brxm", nullable = true, length = 20)
    public String getBrxm() {
        return brxm;
    }

    public void setBrxm(String brxm) {
        this.brxm = brxm;
    }

    @Basic
    @Column(name = "brxb", nullable = true, length = -1)
    public String getBrxb() {
        return brxb;
    }

    public void setBrxb(String brxb) {
        this.brxb = brxb;
    }

    @Basic
    @Column(name = "brnl", nullable = true, length = 10)
    public String getBrnl() {
        return brnl;
    }

    public void setBrnl(String brnl) {
        this.brnl = brnl;
    }

    @Basic
    @Column(name = "nllx", nullable = true, length = -1)
    public String getNllx() {
        return nllx;
    }

    public void setNllx(String nllx) {
        this.nllx = nllx;
    }

    @Basic
    @Column(name = "brkb", nullable = true, length = 10)
    public String getBrkb() {
        return brkb;
    }

    public void setBrkb(String brkb) {
        this.brkb = brkb;
    }

    @Basic
    @Column(name = "brch", nullable = true, length = 10)
    public String getBrch() {
        return brch;
    }

    public void setBrch(String brch) {
        this.brch = brch;
    }

    @Basic
    @Column(name = "bbzl", nullable = true, length = 10)
    public String getBbzl() {
        return bbzl;
    }

    public void setBbzl(String bbzl) {
        this.bbzl = bbzl;
    }

    @Basic
    @Column(name = "cyrq", nullable = true)
    public Timestamp getCyrq() {
        return cyrq;
    }

    public void setCyrq(Timestamp cyrq) {
        this.cyrq = cyrq;
    }

    @Basic
    @Column(name = "FSRQ", nullable = true)
    public Timestamp getFsrq() {
        return fsrq;
    }

    public void setFsrq(Timestamp fsrq) {
        this.fsrq = fsrq;
    }

    @Basic
    @Column(name = "djrq", nullable = true)
    public Timestamp getDjrq() {
        return djrq;
    }

    public void setDjrq(Timestamp djrq) {
        this.djrq = djrq;
    }

    @Basic
    @Column(name = "cdrq", nullable = true)
    public Timestamp getCdrq() {
        return cdrq;
    }

    public void setCdrq(Timestamp cdrq) {
        this.cdrq = cdrq;
    }

    @Basic
    @Column(name = "sjys", nullable = true, length = 40)
    public String getSjys() {
        return sjys;
    }

    public void setSjys(String sjys) {
        this.sjys = sjys;
    }

    @Basic
    @Column(name = "jyys", nullable = true, length = 10)
    public String getJyys() {
        return jyys;
    }

    public void setJyys(String jyys) {
        this.jyys = jyys;
    }

    @Basic
    @Column(name = "shys", nullable = true, length = 10)
    public String getShys() {
        return shys;
    }

    public void setShys(String shys) {
        this.shys = shys;
    }

    @Basic
    @Column(name = "jymd", nullable = true, length = 200)
    public String getJymd() {
        return jymd;
    }

    public void setJymd(String jymd) {
        this.jymd = jymd;
    }

    @Basic
    @Column(name = "jymdmc", nullable = true, length = 100)
    public String getJymdmc() {
        return jymdmc;
    }

    public void setJymdmc(String jymdmc) {
        this.jymdmc = jymdmc;
    }

    @Basic
    @Column(name = "bgrq", nullable = true)
    public Timestamp getBgrq() {
        return bgrq;
    }

    public void setBgrq(Timestamp bgrq) {
        this.bgrq = bgrq;
    }

    @Basic
    @Column(name = "ybzt", nullable = true, length = -1)
    public String getYbzt() {
        return ybzt;
    }

    public void setYbzt(String ybzt) {
        this.ybzt = ybzt;
    }

    @Basic
    @Column(name = "sfzt", nullable = true, length = -1)
    public String getSfzt() {
        return sfzt;
    }

    public void setSfzt(String sfzt) {
        this.sfzt = sfzt;
    }

    @Basic
    @Column(name = "ybsf", nullable = true)
    public BigDecimal getYbsf() {
        return ybsf;
    }

    public void setYbsf(BigDecimal ybsf) {
        this.ybsf = ybsf;
    }

    @Basic
    @Column(name = "gzl", nullable = true)
    public Integer getGzl() {
        return gzl;
    }

    public void setGzl(Integer gzl) {
        this.gzl = gzl;
    }

    @Basic
    @Column(name = "jbh", nullable = true, length = 20)
    public String getJbh() {
        return jbh;
    }

    public void setJbh(String jbh) {
        this.jbh = jbh;
    }

    @Basic
    @Column(name = "beizhu", nullable = true, length = 200)
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "lastmodify", nullable = true)
    public Timestamp getLastmodify() {
        return lastmodify;
    }

    public void setLastmodify(Timestamp lastmodify) {
        this.lastmodify = lastmodify;
    }

    @Basic
    @Column(name = "brxz", nullable = true)
    public Integer getBrxz() {
        return brxz;
    }

    public void setBrxz(Integer brxz) {
        this.brxz = brxz;
    }

    @Basic
    @Column(name = "brxh", nullable = true, length = 36)
    public String getBrxh() {
        return brxh;
    }

    public void setBrxh(String brxh) {
        this.brxh = brxh;
    }

    @Basic
    @Column(name = "srys", nullable = true, length = 16)
    public String getSrys() {
        return srys;
    }

    public void setSrys(String srys) {
        this.srys = srys;
    }

    @Basic
    @Column(name = "bgys", nullable = true, length = 16)
    public String getBgys() {
        return bgys;
    }

    public void setBgys(String bgys) {
        this.bgys = bgys;
    }

    @Basic
    @Column(name = "sendzt", nullable = true, length = -1)
    public String getSendzt() {
        return sendzt;
    }

    public void setSendzt(String sendzt) {
        this.sendzt = sendzt;
    }

    @Basic
    @Column(name = "brbq", nullable = true, length = 20)
    public String getBrbq() {
        return brbq;
    }

    public void setBrbq(String brbq) {
        this.brbq = brbq;
    }

    @Basic
    @Column(name = "khks", nullable = true, length = 20)
    public String getKhks() {
        return khks;
    }

    public void setKhks(String khks) {
        this.khks = khks;
    }

    @Basic
    @Column(name = "printcs", nullable = true, length = 4)
    public String getPrintcs() {
        return printcs;
    }

    public void setPrintcs(String printcs) {
        this.printcs = printcs;
    }

    @Basic
    @Column(name = "rkbz", nullable = true)
    public Integer getRkbz() {
        return rkbz;
    }

    public void setRkbz(Integer rkbz) {
        this.rkbz = rkbz;
    }

    @Basic
    @Column(name = "zkybsf", nullable = true)
    public BigDecimal getZkybsf() {
        return zkybsf;
    }

    public void setZkybsf(BigDecimal zkybsf) {
        this.zkybsf = zkybsf;
    }

    @Basic
    @Column(name = "bljchao", nullable = true, length = 20)
    public String getBljchao() {
        return bljchao;
    }

    public void setBljchao(String bljchao) {
        this.bljchao = bljchao;
    }

    @Basic
    @Column(name = "yyyzh", nullable = true, length = 20)
    public String getYyyzh() {
        return yyyzh;
    }

    public void setYyyzh(String yyyzh) {
        this.yyyzh = yyyzh;
    }

    @Basic
    @Column(name = "bz", nullable = true, length = 350)
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "qcljs", nullable = true, length = -1)
    public String getQcljs() {
        return qcljs;
    }

    public void setQcljs(String qcljs) {
        this.qcljs = qcljs;
    }

    @Basic
    @Column(name = "yytm", nullable = true, length = 50)
    public String getYytm() {
        return yytm;
    }

    public void setYytm(String yytm) {
        this.yytm = yytm;
    }

    @Basic
    @Column(name = "crowdatetime", nullable = true)
    public Timestamp getCrowdatetime() {
        return crowdatetime;
    }

    public void setCrowdatetime(Timestamp crowdatetime) {
        this.crowdatetime = crowdatetime;
    }

    @Basic
    @Column(name = "keyid", nullable = true, length = 50)
    public String getKeyid() {
        return keyid;
    }

    public void setKeyid(String keyid) {
        this.keyid = keyid;
    }

    @Basic
    @Column(name = "xmstring", nullable = true, length = -1)
    public String getXmstring() {
        return xmstring;
    }

    public void setXmstring(String xmstring) {
        this.xmstring = xmstring;
    }

    @Basic
    @Column(name = "ptype", nullable = true, length = 20)
    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    @Basic
    @Column(name = "operator", nullable = true, length = 500)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "qrbz", nullable = true)
    public Integer getQrbz() {
        return qrbz;
    }

    public void setQrbz(Integer qrbz) {
        this.qrbz = qrbz;
    }

    @Basic
    @Column(name = "clientdes", nullable = true, length = 500)
    public String getClientdes() {
        return clientdes;
    }

    public void setClientdes(String clientdes) {
        this.clientdes = clientdes;
    }

    @Basic
    @Column(name = "itemdes", nullable = true, length = -1)
    public String getItemdes() {
        return itemdes;
    }

    public void setItemdes(String itemdes) {
        this.itemdes = itemdes;
    }

    @Basic
    @Column(name = "isxxzx", nullable = true, length = -1)
    public String getIsxxzx() {
        return isxxzx;
    }

    public void setIsxxzx(String isxxzx) {
        this.isxxzx = isxxzx;
    }

    @Basic
    @Column(name = "confirmstatus", nullable = true)
    public Integer getConfirmstatus() {
        return confirmstatus;
    }

    public void setConfirmstatus(Integer confirmstatus) {
        this.confirmstatus = confirmstatus;
    }

    @Basic
    @Column(name = "qrry", nullable = true, length = 50)
    public String getQrry() {
        return qrry;
    }

    public void setQrry(String qrry) {
        this.qrry = qrry;
    }

    @Basic
    @Column(name = "qrsj", nullable = true)
    public Timestamp getQrsj() {
        return qrsj;
    }

    public void setQrsj(Timestamp qrsj) {
        this.qrsj = qrsj;
    }

    @Basic
    @Column(name = "eqrry", nullable = true, length = 50)
    public String getEqrry() {
        return eqrry;
    }

    public void setEqrry(String eqrry) {
        this.eqrry = eqrry;
    }

    @Basic
    @Column(name = "eqrsj", nullable = true)
    public Timestamp getEqrsj() {
        return eqrsj;
    }

    public void setEqrsj(Timestamp eqrsj) {
        this.eqrsj = eqrsj;
    }

    @Basic
    @Column(name = "qrzt", nullable = true, length = -1)
    public String getQrzt() {
        return qrzt;
    }

    public void setQrzt(String qrzt) {
        this.qrzt = qrzt;
    }

    @Basic
    @Column(name = "eqrzt", nullable = true, length = -1)
    public String getEqrzt() {
        return eqrzt;
    }

    public void setEqrzt(String eqrzt) {
        this.eqrzt = eqrzt;
    }

    @Basic
    @Column(name = "csqr", nullable = true)
    public Integer getCsqr() {
        return csqr;
    }

    public void setCsqr(Integer csqr) {
        this.csqr = csqr;
    }

    @Basic
    @Column(name = "cardno", nullable = true, length = 50)
    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    @Basic
    @Column(name = "pnameen", nullable = true, length = 50)
    public String getPnameen() {
        return pnameen;
    }

    public void setPnameen(String pnameen) {
        this.pnameen = pnameen;
    }

    @Basic
    @Column(name = "recievetime", nullable = true)
    public Timestamp getRecievetime() {
        return recievetime;
    }

    public void setRecievetime(Timestamp recievetime) {
        this.recievetime = recievetime;
    }

    @Basic
    @Column(name = "patientid", nullable = true, length = 30)
    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    @Basic
    @Column(name = "recieveerror", nullable = true)
    public Short getRecieveerror() {
        return recieveerror;
    }

    public void setRecieveerror(Short recieveerror) {
        this.recieveerror = recieveerror;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 128)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "patienttype", nullable = true, length = 16)
    public String getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
    }

    @Basic
    @Column(name = "projcode", nullable = true, length = 16)
    public String getProjcode() {
        return projcode;
    }

    public void setProjcode(String projcode) {
        this.projcode = projcode;
    }

    @Basic
    @Column(name = "pageno", nullable = true)
    public Integer getPageno() {
        return pageno;
    }

    public void setPageno(Integer pageno) {
        this.pageno = pageno;
    }

    @Basic
    @Column(name = "pagexh", nullable = true)
    public Integer getPagexh() {
        return pagexh;
    }

    public void setPagexh(Integer pagexh) {
        this.pagexh = pagexh;
    }

    @Basic
    @Column(name = "recieveman", nullable = true, length = 50)
    public String getRecieveman() {
        return recieveman;
    }

    public void setRecieveman(String recieveman) {
        this.recieveman = recieveman;
    }

    @Basic
    @Column(name = "bbxz", nullable = true, length = 10)
    public String getBbxz() {
        return bbxz;
    }

    public void setBbxz(String bbxz) {
        this.bbxz = bbxz;
    }

    @Basic
    @Column(name = "csrq", nullable = true)
    public Timestamp getCsrq() {
        return csrq;
    }

    public void setCsrq(Timestamp csrq) {
        this.csrq = csrq;
    }

    @Basic
    @Column(name = "ismodified", nullable = true)
    public Integer getIsmodified() {
        return ismodified;
    }

    public void setIsmodified(Integer ismodified) {
        this.ismodified = ismodified;
    }

    @Basic
    @Column(name = "TestTypeNo", nullable = true, length = 10)
    public String getTestTypeNo() {
        return testTypeNo;
    }

    public void setTestTypeNo(String testTypeNo) {
        this.testTypeNo = testTypeNo;
    }

    @Basic
    @Column(name = "CollectDateTime", nullable = true)
    public Timestamp getCollectDateTime() {
        return collectDateTime;
    }

    public void setCollectDateTime(Timestamp collectDateTime) {
        this.collectDateTime = collectDateTime;
    }

    @Basic
    @Column(name = "xxly", nullable = true, length = 50)
    public String getXxly() {
        return xxly;
    }

    public void setXxly(String xxly) {
        this.xxly = xxly;
    }

    @Basic
    @Column(name = "yydm", nullable = true, length = 20)
    public String getYydm() {
        return yydm;
    }

    public void setYydm(String yydm) {
        this.yydm = yydm;
    }

    @Basic
    @Column(name = "tjbh", nullable = true, length = 20)
    public String getTjbh() {
        return tjbh;
    }

    public void setTjbh(String tjbh) {
        this.tjbh = tjbh;
    }

    @Basic
    @Column(name = "sfje", nullable = true, precision = 2)
    public BigDecimal getSfje() {
        return sfje;
    }

    public void setSfje(BigDecimal sfje) {
        this.sfje = sfje;
    }

    @Basic
    @Column(name = "ZK", nullable = true, precision = 4)
    public BigDecimal getZk() {
        return zk;
    }

    public void setZk(BigDecimal zk) {
        this.zk = zk;
    }

    @Basic
    @Column(name = "JMJE", nullable = true, precision = 2)
    public BigDecimal getJmje() {
        return jmje;
    }

    public void setJmje(BigDecimal jmje) {
        this.jmje = jmje;
    }

    @Basic
    @Column(name = "SJJE", nullable = true, precision = 2)
    public BigDecimal getSjje() {
        return sjje;
    }

    public void setSjje(BigDecimal sjje) {
        this.sjje = sjje;
    }

    @Basic
    @Column(name = "ZKJE", nullable = true, precision = 2)
    public BigDecimal getZkje() {
        return zkje;
    }

    public void setZkje(BigDecimal zkje) {
        this.zkje = zkje;
    }

    @Basic
    @Column(name = "lczd_1", nullable = true, length = 40)
    public String getLczd1() {
        return lczd1;
    }

    public void setLczd1(String lczd1) {
        this.lczd1 = lczd1;
    }

    @Basic
    @Column(name = "lczd_2", nullable = true, length = 40)
    public String getLczd2() {
        return lczd2;
    }

    public void setLczd2(String lczd2) {
        this.lczd2 = lczd2;
    }

    @Basic
    @Column(name = "lczd", nullable = true, length = 40)
    public String getLczd() {
        return lczd;
    }

    public void setLczd(String lczd) {
        this.lczd = lczd;
    }

    @Basic
    @Column(name = "ptflag", nullable = true)
    public Byte getPtflag() {
        return ptflag;
    }

    public void setPtflag(Byte ptflag) {
        this.ptflag = ptflag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LisFKYbxxEntity that = (LisFKYbxxEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ybbh != null ? !ybbh.equals(that.ybbh) : that.ybbh != null) return false;
        if (ybid != null ? !ybid.equals(that.ybid) : that.ybid != null) return false;
        if (brlb != null ? !brlb.equals(that.brlb) : that.brlb != null) return false;
        if (byh != null ? !byh.equals(that.byh) : that.byh != null) return false;
        if (brxm != null ? !brxm.equals(that.brxm) : that.brxm != null) return false;
        if (brxb != null ? !brxb.equals(that.brxb) : that.brxb != null) return false;
        if (brnl != null ? !brnl.equals(that.brnl) : that.brnl != null) return false;
        if (nllx != null ? !nllx.equals(that.nllx) : that.nllx != null) return false;
        if (brkb != null ? !brkb.equals(that.brkb) : that.brkb != null) return false;
        if (brch != null ? !brch.equals(that.brch) : that.brch != null) return false;
        if (bbzl != null ? !bbzl.equals(that.bbzl) : that.bbzl != null) return false;
        if (cyrq != null ? !cyrq.equals(that.cyrq) : that.cyrq != null) return false;
        if (fsrq != null ? !fsrq.equals(that.fsrq) : that.fsrq != null) return false;
        if (djrq != null ? !djrq.equals(that.djrq) : that.djrq != null) return false;
        if (cdrq != null ? !cdrq.equals(that.cdrq) : that.cdrq != null) return false;
        if (sjys != null ? !sjys.equals(that.sjys) : that.sjys != null) return false;
        if (jyys != null ? !jyys.equals(that.jyys) : that.jyys != null) return false;
        if (shys != null ? !shys.equals(that.shys) : that.shys != null) return false;
        if (jymd != null ? !jymd.equals(that.jymd) : that.jymd != null) return false;
        if (jymdmc != null ? !jymdmc.equals(that.jymdmc) : that.jymdmc != null) return false;
        if (bgrq != null ? !bgrq.equals(that.bgrq) : that.bgrq != null) return false;
        if (ybzt != null ? !ybzt.equals(that.ybzt) : that.ybzt != null) return false;
        if (sfzt != null ? !sfzt.equals(that.sfzt) : that.sfzt != null) return false;
        if (ybsf != null ? !ybsf.equals(that.ybsf) : that.ybsf != null) return false;
        if (gzl != null ? !gzl.equals(that.gzl) : that.gzl != null) return false;
        if (jbh != null ? !jbh.equals(that.jbh) : that.jbh != null) return false;
        if (beizhu != null ? !beizhu.equals(that.beizhu) : that.beizhu != null) return false;
        if (lastmodify != null ? !lastmodify.equals(that.lastmodify) : that.lastmodify != null) return false;
        if (brxz != null ? !brxz.equals(that.brxz) : that.brxz != null) return false;
        if (brxh != null ? !brxh.equals(that.brxh) : that.brxh != null) return false;
        if (srys != null ? !srys.equals(that.srys) : that.srys != null) return false;
        if (bgys != null ? !bgys.equals(that.bgys) : that.bgys != null) return false;
        if (sendzt != null ? !sendzt.equals(that.sendzt) : that.sendzt != null) return false;
        if (brbq != null ? !brbq.equals(that.brbq) : that.brbq != null) return false;
        if (khks != null ? !khks.equals(that.khks) : that.khks != null) return false;
        if (printcs != null ? !printcs.equals(that.printcs) : that.printcs != null) return false;
        if (rkbz != null ? !rkbz.equals(that.rkbz) : that.rkbz != null) return false;
        if (zkybsf != null ? !zkybsf.equals(that.zkybsf) : that.zkybsf != null) return false;
        if (bljchao != null ? !bljchao.equals(that.bljchao) : that.bljchao != null) return false;
        if (yyyzh != null ? !yyyzh.equals(that.yyyzh) : that.yyyzh != null) return false;
        if (bz != null ? !bz.equals(that.bz) : that.bz != null) return false;
        if (qcljs != null ? !qcljs.equals(that.qcljs) : that.qcljs != null) return false;
        if (yytm != null ? !yytm.equals(that.yytm) : that.yytm != null) return false;
        if (crowdatetime != null ? !crowdatetime.equals(that.crowdatetime) : that.crowdatetime != null) return false;
        if (keyid != null ? !keyid.equals(that.keyid) : that.keyid != null) return false;
        if (xmstring != null ? !xmstring.equals(that.xmstring) : that.xmstring != null) return false;
        if (ptype != null ? !ptype.equals(that.ptype) : that.ptype != null) return false;
        if (operator != null ? !operator.equals(that.operator) : that.operator != null) return false;
        if (qrbz != null ? !qrbz.equals(that.qrbz) : that.qrbz != null) return false;
        if (clientdes != null ? !clientdes.equals(that.clientdes) : that.clientdes != null) return false;
        if (itemdes != null ? !itemdes.equals(that.itemdes) : that.itemdes != null) return false;
        if (isxxzx != null ? !isxxzx.equals(that.isxxzx) : that.isxxzx != null) return false;
        if (confirmstatus != null ? !confirmstatus.equals(that.confirmstatus) : that.confirmstatus != null)
            return false;
        if (qrry != null ? !qrry.equals(that.qrry) : that.qrry != null) return false;
        if (qrsj != null ? !qrsj.equals(that.qrsj) : that.qrsj != null) return false;
        if (eqrry != null ? !eqrry.equals(that.eqrry) : that.eqrry != null) return false;
        if (eqrsj != null ? !eqrsj.equals(that.eqrsj) : that.eqrsj != null) return false;
        if (qrzt != null ? !qrzt.equals(that.qrzt) : that.qrzt != null) return false;
        if (eqrzt != null ? !eqrzt.equals(that.eqrzt) : that.eqrzt != null) return false;
        if (csqr != null ? !csqr.equals(that.csqr) : that.csqr != null) return false;
        if (cardno != null ? !cardno.equals(that.cardno) : that.cardno != null) return false;
        if (pnameen != null ? !pnameen.equals(that.pnameen) : that.pnameen != null) return false;
        if (recievetime != null ? !recievetime.equals(that.recievetime) : that.recievetime != null) return false;
        if (patientid != null ? !patientid.equals(that.patientid) : that.patientid != null) return false;
        if (recieveerror != null ? !recieveerror.equals(that.recieveerror) : that.recieveerror != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (patienttype != null ? !patienttype.equals(that.patienttype) : that.patienttype != null) return false;
        if (projcode != null ? !projcode.equals(that.projcode) : that.projcode != null) return false;
        if (pageno != null ? !pageno.equals(that.pageno) : that.pageno != null) return false;
        if (pagexh != null ? !pagexh.equals(that.pagexh) : that.pagexh != null) return false;
        if (recieveman != null ? !recieveman.equals(that.recieveman) : that.recieveman != null) return false;
        if (bbxz != null ? !bbxz.equals(that.bbxz) : that.bbxz != null) return false;
        if (csrq != null ? !csrq.equals(that.csrq) : that.csrq != null) return false;
        if (ismodified != null ? !ismodified.equals(that.ismodified) : that.ismodified != null) return false;
        if (testTypeNo != null ? !testTypeNo.equals(that.testTypeNo) : that.testTypeNo != null) return false;
        if (collectDateTime != null ? !collectDateTime.equals(that.collectDateTime) : that.collectDateTime != null)
            return false;
        if (xxly != null ? !xxly.equals(that.xxly) : that.xxly != null) return false;
        if (yydm != null ? !yydm.equals(that.yydm) : that.yydm != null) return false;
        if (tjbh != null ? !tjbh.equals(that.tjbh) : that.tjbh != null) return false;
        if (sfje != null ? !sfje.equals(that.sfje) : that.sfje != null) return false;
        if (zk != null ? !zk.equals(that.zk) : that.zk != null) return false;
        if (jmje != null ? !jmje.equals(that.jmje) : that.jmje != null) return false;
        if (sjje != null ? !sjje.equals(that.sjje) : that.sjje != null) return false;
        if (zkje != null ? !zkje.equals(that.zkje) : that.zkje != null) return false;
        if (lczd1 != null ? !lczd1.equals(that.lczd1) : that.lczd1 != null) return false;
        if (lczd2 != null ? !lczd2.equals(that.lczd2) : that.lczd2 != null) return false;
        if (lczd != null ? !lczd.equals(that.lczd) : that.lczd != null) return false;
        if (ptflag != null ? !ptflag.equals(that.ptflag) : that.ptflag != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ybbh != null ? ybbh.hashCode() : 0);
        result = 31 * result + (ybid != null ? ybid.hashCode() : 0);
        result = 31 * result + (brlb != null ? brlb.hashCode() : 0);
        result = 31 * result + (byh != null ? byh.hashCode() : 0);
        result = 31 * result + (brxm != null ? brxm.hashCode() : 0);
        result = 31 * result + (brxb != null ? brxb.hashCode() : 0);
        result = 31 * result + (brnl != null ? brnl.hashCode() : 0);
        result = 31 * result + (nllx != null ? nllx.hashCode() : 0);
        result = 31 * result + (brkb != null ? brkb.hashCode() : 0);
        result = 31 * result + (brch != null ? brch.hashCode() : 0);
        result = 31 * result + (bbzl != null ? bbzl.hashCode() : 0);
        result = 31 * result + (cyrq != null ? cyrq.hashCode() : 0);
        result = 31 * result + (fsrq != null ? fsrq.hashCode() : 0);
        result = 31 * result + (djrq != null ? djrq.hashCode() : 0);
        result = 31 * result + (cdrq != null ? cdrq.hashCode() : 0);
        result = 31 * result + (sjys != null ? sjys.hashCode() : 0);
        result = 31 * result + (jyys != null ? jyys.hashCode() : 0);
        result = 31 * result + (shys != null ? shys.hashCode() : 0);
        result = 31 * result + (jymd != null ? jymd.hashCode() : 0);
        result = 31 * result + (jymdmc != null ? jymdmc.hashCode() : 0);
        result = 31 * result + (bgrq != null ? bgrq.hashCode() : 0);
        result = 31 * result + (ybzt != null ? ybzt.hashCode() : 0);
        result = 31 * result + (sfzt != null ? sfzt.hashCode() : 0);
        result = 31 * result + (ybsf != null ? ybsf.hashCode() : 0);
        result = 31 * result + (gzl != null ? gzl.hashCode() : 0);
        result = 31 * result + (jbh != null ? jbh.hashCode() : 0);
        result = 31 * result + (beizhu != null ? beizhu.hashCode() : 0);
        result = 31 * result + (lastmodify != null ? lastmodify.hashCode() : 0);
        result = 31 * result + (brxz != null ? brxz.hashCode() : 0);
        result = 31 * result + (brxh != null ? brxh.hashCode() : 0);
        result = 31 * result + (srys != null ? srys.hashCode() : 0);
        result = 31 * result + (bgys != null ? bgys.hashCode() : 0);
        result = 31 * result + (sendzt != null ? sendzt.hashCode() : 0);
        result = 31 * result + (brbq != null ? brbq.hashCode() : 0);
        result = 31 * result + (khks != null ? khks.hashCode() : 0);
        result = 31 * result + (printcs != null ? printcs.hashCode() : 0);
        result = 31 * result + (rkbz != null ? rkbz.hashCode() : 0);
        result = 31 * result + (zkybsf != null ? zkybsf.hashCode() : 0);
        result = 31 * result + (bljchao != null ? bljchao.hashCode() : 0);
        result = 31 * result + (yyyzh != null ? yyyzh.hashCode() : 0);
        result = 31 * result + (bz != null ? bz.hashCode() : 0);
        result = 31 * result + (qcljs != null ? qcljs.hashCode() : 0);
        result = 31 * result + (yytm != null ? yytm.hashCode() : 0);
        result = 31 * result + (crowdatetime != null ? crowdatetime.hashCode() : 0);
        result = 31 * result + (keyid != null ? keyid.hashCode() : 0);
        result = 31 * result + (xmstring != null ? xmstring.hashCode() : 0);
        result = 31 * result + (ptype != null ? ptype.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (qrbz != null ? qrbz.hashCode() : 0);
        result = 31 * result + (clientdes != null ? clientdes.hashCode() : 0);
        result = 31 * result + (itemdes != null ? itemdes.hashCode() : 0);
        result = 31 * result + (isxxzx != null ? isxxzx.hashCode() : 0);
        result = 31 * result + (confirmstatus != null ? confirmstatus.hashCode() : 0);
        result = 31 * result + (qrry != null ? qrry.hashCode() : 0);
        result = 31 * result + (qrsj != null ? qrsj.hashCode() : 0);
        result = 31 * result + (eqrry != null ? eqrry.hashCode() : 0);
        result = 31 * result + (eqrsj != null ? eqrsj.hashCode() : 0);
        result = 31 * result + (qrzt != null ? qrzt.hashCode() : 0);
        result = 31 * result + (eqrzt != null ? eqrzt.hashCode() : 0);
        result = 31 * result + (csqr != null ? csqr.hashCode() : 0);
        result = 31 * result + (cardno != null ? cardno.hashCode() : 0);
        result = 31 * result + (pnameen != null ? pnameen.hashCode() : 0);
        result = 31 * result + (recievetime != null ? recievetime.hashCode() : 0);
        result = 31 * result + (patientid != null ? patientid.hashCode() : 0);
        result = 31 * result + (recieveerror != null ? recieveerror.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (patienttype != null ? patienttype.hashCode() : 0);
        result = 31 * result + (projcode != null ? projcode.hashCode() : 0);
        result = 31 * result + (pageno != null ? pageno.hashCode() : 0);
        result = 31 * result + (pagexh != null ? pagexh.hashCode() : 0);
        result = 31 * result + (recieveman != null ? recieveman.hashCode() : 0);
        result = 31 * result + (bbxz != null ? bbxz.hashCode() : 0);
        result = 31 * result + (csrq != null ? csrq.hashCode() : 0);
        result = 31 * result + (ismodified != null ? ismodified.hashCode() : 0);
        result = 31 * result + (testTypeNo != null ? testTypeNo.hashCode() : 0);
        result = 31 * result + (collectDateTime != null ? collectDateTime.hashCode() : 0);
        result = 31 * result + (xxly != null ? xxly.hashCode() : 0);
        result = 31 * result + (yydm != null ? yydm.hashCode() : 0);
        result = 31 * result + (tjbh != null ? tjbh.hashCode() : 0);
        result = 31 * result + (sfje != null ? sfje.hashCode() : 0);
        result = 31 * result + (zk != null ? zk.hashCode() : 0);
        result = 31 * result + (jmje != null ? jmje.hashCode() : 0);
        result = 31 * result + (sjje != null ? sjje.hashCode() : 0);
        result = 31 * result + (zkje != null ? zkje.hashCode() : 0);
        result = 31 * result + (lczd1 != null ? lczd1.hashCode() : 0);
        result = 31 * result + (lczd2 != null ? lczd2.hashCode() : 0);
        result = 31 * result + (lczd != null ? lczd.hashCode() : 0);
        result = 31 * result + (ptflag != null ? ptflag.hashCode() : 0);
        return result;
    }
}
