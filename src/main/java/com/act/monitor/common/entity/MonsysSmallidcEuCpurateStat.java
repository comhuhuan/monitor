package com.act.monitor.common.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;


/**
 * 
 * 
 * @author Mr.AG
 * @email 463540703@qq.com
 * @date 2017-11-28 15:07:55
 */
@Table(name = "monsys_smallidc_eu_cpurate_stat")
public class MonsysSmallidcEuCpurateStat implements Serializable {
	private static final long serialVersionUID = 1L;
	
	    //唯一用户ID
    @Id
    private String uuid;
	
	    //
    @Column(name = "houseID")
    private Long houseid;
	
	    //
    @Column(name = "euID")
    private String euid;
	
	    //CPU核数
    @Column(name = "coreNum")
    private Integer corenum;
	
	    //0号CPU的使用率
    @Column(name = "cpu0")
    private String cpu0;
	
	    //1号CPU的使用率
    @Column(name = "cpu1")
    private String cpu1;
	
	    //
    @Column(name = "cpu2")
    private String cpu2;
	
	    //
    @Column(name = "cpu3")
    private String cpu3;
	
	    //
    @Column(name = "cpu4")
    private String cpu4;
	
	    //
    @Column(name = "cpu5")
    private String cpu5;
	
	    //
    @Column(name = "cpu6")
    private String cpu6;
	
	    //
    @Column(name = "cpu7")
    private String cpu7;
	
	    //
    @Column(name = "cpu8")
    private String cpu8;
	
	    //
    @Column(name = "cpu9")
    private String cpu9;
	
	    //
    @Column(name = "cpu10")
    private String cpu10;
	
	    //
    @Column(name = "cpu11")
    private String cpu11;
	
	    //
    @Column(name = "cpu12")
    private String cpu12;
	
	    //
    @Column(name = "cpu13")
    private String cpu13;
	
	    //
    @Column(name = "cpu14")
    private String cpu14;
	
	    //
    @Column(name = "cpu15")
    private String cpu15;
	
	    //
    @Column(name = "cpu16")
    private String cpu16;
	
	    //
    @Column(name = "cpu17")
    private String cpu17;
	
	    //
    @Column(name = "cpu18")
    private String cpu18;
	
	    //
    @Column(name = "cpu19")
    private String cpu19;
	
	    //
    @Column(name = "cpu20")
    private String cpu20;
	
	    //
    @Column(name = "cpu21")
    private String cpu21;
	
	    //
    @Column(name = "cpu22")
    private String cpu22;
	
	    //
    @Column(name = "cpu23")
    private String cpu23;
	
	    //
    @Column(name = "cpu24")
    private String cpu24;
	
	    //
    @Column(name = "cpu25")
    private String cpu25;
	
	    //
    @Column(name = "cpu26")
    private String cpu26;
	
	    //
    @Column(name = "cpu27")
    private String cpu27;
	
	    //
    @Column(name = "cpu28")
    private String cpu28;
	
	    //
    @Column(name = "cpu29")
    private String cpu29;
	
	    //
    @Column(name = "cpu30")
    private String cpu30;
	
	    //
    @Column(name = "cpu31")
    private String cpu31;
	
	    //
    @Column(name = "cpu32")
    private String cpu32;
	
	    //
    @Column(name = "cpu33")
    private String cpu33;
	
	    //
    @Column(name = "cpu34")
    private String cpu34;
	
	    //
    @Column(name = "cpu35")
    private String cpu35;
	
	    //
    @Column(name = "cpu36")
    private String cpu36;
	
	    //
    @Column(name = "cpu37")
    private String cpu37;
	
	    //
    @Column(name = "cpu38")
    private String cpu38;
	
	    //
    @Column(name = "cpu39")
    private String cpu39;
	
	    //
    @Column(name = "cpu40")
    private String cpu40;
	
	    //
    @Column(name = "cpu41")
    private String cpu41;
	
	    //
    @Column(name = "cpu42")
    private String cpu42;
	
	    //
    @Column(name = "cpu43")
    private String cpu43;
	
	    //
    @Column(name = "cpu44")
    private String cpu44;
	
	    //
    @Column(name = "cpu45")
    private String cpu45;
	
	    //
    @Column(name = "cpu46")
    private String cpu46;
	
	    //
    @Column(name = "cpu47")
    private String cpu47;
	
	    //
    @Column(name = "cpu48")
    private String cpu48;
	
	    //
    @Column(name = "cpu49")
    private String cpu49;
	
	    //
    @Column(name = "cpu50")
    private String cpu50;
	
	    //
    @Column(name = "cpu51")
    private String cpu51;
	
	    //
    @Column(name = "cpu52")
    private String cpu52;
	
	    //
    @Column(name = "cpu53")
    private String cpu53;
	
	    //
    @Column(name = "cpu54")
    private String cpu54;
	
	    //
    @Column(name = "cpu55")
    private String cpu55;
	
	    //
    @Column(name = "cpu56")
    private String cpu56;
	
	    //
    @Column(name = "cpu57")
    private String cpu57;
	
	    //
    @Column(name = "cpu58")
    private String cpu58;
	
	    //
    @Column(name = "cpu59")
    private String cpu59;
	
	    //
    @Column(name = "cpu60")
    private String cpu60;
	
	    //
    @Column(name = "cpu61")
    private String cpu61;
	
	    //
    @Column(name = "cpu62")
    private String cpu62;
	
	    //
    @Column(name = "cpu63")
    private String cpu63;
	
	    //
    @Column(name = "cpu64")
    private String cpu64;
	
	    //
    @Column(name = "cpu65")
    private String cpu65;
	
	    //
    @Column(name = "cpu66")
    private String cpu66;
	
	    //
    @Column(name = "cpu67")
    private String cpu67;
	
	    //
    @Column(name = "cpu68")
    private String cpu68;
	
	    //
    @Column(name = "cpu69")
    private String cpu69;
	
	    //
    @Column(name = "cpu70")
    private String cpu70;
	
	    //
    @Column(name = "cpu71")
    private String cpu71;
	
	    //
    @Column(name = "cpu72")
    private String cpu72;
	
	    //
    @Column(name = "cpu73")
    private String cpu73;
	
	    //
    @Column(name = "cpu74")
    private String cpu74;
	
	    //
    @Column(name = "cpu75")
    private String cpu75;
	
	    //
    @Column(name = "cpu76")
    private String cpu76;
	
	    //
    @Column(name = "cpu77")
    private String cpu77;
	
	    //
    @Column(name = "cpu78")
    private String cpu78;
	
	    //
    @Column(name = "cpu79")
    private String cpu79;
	
	    //
    @Column(name = "cpu80")
    private String cpu80;
	
	    //
    @Column(name = "cpu81")
    private String cpu81;
	
	    //
    @Column(name = "cpu82")
    private String cpu82;
	
	    //
    @Column(name = "cpu83")
    private String cpu83;
	
	    //
    @Column(name = "cpu84")
    private String cpu84;
	
	    //
    @Column(name = "cpu85")
    private String cpu85;
	
	    //
    @Column(name = "cpu86")
    private String cpu86;
	
	    //
    @Column(name = "cpu87")
    private String cpu87;
	
	    //
    @Column(name = "cpu88")
    private String cpu88;
	
	    //
    @Column(name = "cpu89")
    private String cpu89;
	
	    //
    @Column(name = "cpu90")
    private String cpu90;
	
	    //
    @Column(name = "cpu91")
    private String cpu91;
	
	    //
    @Column(name = "cpu92")
    private String cpu92;
	
	    //
    @Column(name = "cpu93")
    private String cpu93;
	
	    //
    @Column(name = "cpu94")
    private String cpu94;
	
	    //
    @Column(name = "cpu95")
    private String cpu95;
	
	    //
    @Column(name = "cpu96")
    private String cpu96;
	
	    //
    @Column(name = "cpu97")
    private String cpu97;
	
	    //
    @Column(name = "cpu98")
    private String cpu98;
	
	    //
    @Column(name = "cpu99")
    private String cpu99;
	
	    //总的CPU使用率
    @Column(name = "cputotal_Rate")
    private String cputotalRate;
	
	    //
    @Column(name = "reserve0")
    private String reserve0;
	
	    //
    @Column(name = "reserve1")
    private String reserve1;
	
	    //是否异常：1-异常  0-正常
    @Column(name = "status")
    private Integer status;
	
	    //记录时间
    @Column(name = "recordTime")
    private Date recordtime;
	

	/**
	 * 设置：唯一用户ID
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：唯一用户ID
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：
	 */
	public void setHouseid(Long houseid) {
		this.houseid = houseid;
	}
	/**
	 * 获取：
	 */
	public Long getHouseid() {
		return houseid;
	}
	/**
	 * 设置：
	 */
	public void setEuid(String euid) {
		this.euid = euid;
	}
	/**
	 * 获取：
	 */
	public String getEuid() {
		return euid;
	}
	/**
	 * 设置：CPU核数
	 */
	public void setCorenum(Integer corenum) {
		this.corenum = corenum;
	}
	/**
	 * 获取：CPU核数
	 */
	public Integer getCorenum() {
		return corenum;
	}
	/**
	 * 设置：0号CPU的使用率
	 */
	public void setCpu0(String cpu0) {
		this.cpu0 = cpu0;
	}
	/**
	 * 获取：0号CPU的使用率
	 */
	public String getCpu0() {
		return cpu0;
	}
	/**
	 * 设置：1号CPU的使用率
	 */
	public void setCpu1(String cpu1) {
		this.cpu1 = cpu1;
	}
	/**
	 * 获取：1号CPU的使用率
	 */
	public String getCpu1() {
		return cpu1;
	}
	/**
	 * 设置：
	 */
	public void setCpu2(String cpu2) {
		this.cpu2 = cpu2;
	}
	/**
	 * 获取：
	 */
	public String getCpu2() {
		return cpu2;
	}
	/**
	 * 设置：
	 */
	public void setCpu3(String cpu3) {
		this.cpu3 = cpu3;
	}
	/**
	 * 获取：
	 */
	public String getCpu3() {
		return cpu3;
	}
	/**
	 * 设置：
	 */
	public void setCpu4(String cpu4) {
		this.cpu4 = cpu4;
	}
	/**
	 * 获取：
	 */
	public String getCpu4() {
		return cpu4;
	}
	/**
	 * 设置：
	 */
	public void setCpu5(String cpu5) {
		this.cpu5 = cpu5;
	}
	/**
	 * 获取：
	 */
	public String getCpu5() {
		return cpu5;
	}
	/**
	 * 设置：
	 */
	public void setCpu6(String cpu6) {
		this.cpu6 = cpu6;
	}
	/**
	 * 获取：
	 */
	public String getCpu6() {
		return cpu6;
	}
	/**
	 * 设置：
	 */
	public void setCpu7(String cpu7) {
		this.cpu7 = cpu7;
	}
	/**
	 * 获取：
	 */
	public String getCpu7() {
		return cpu7;
	}
	/**
	 * 设置：
	 */
	public void setCpu8(String cpu8) {
		this.cpu8 = cpu8;
	}
	/**
	 * 获取：
	 */
	public String getCpu8() {
		return cpu8;
	}
	/**
	 * 设置：
	 */
	public void setCpu9(String cpu9) {
		this.cpu9 = cpu9;
	}
	/**
	 * 获取：
	 */
	public String getCpu9() {
		return cpu9;
	}
	/**
	 * 设置：
	 */
	public void setCpu10(String cpu10) {
		this.cpu10 = cpu10;
	}
	/**
	 * 获取：
	 */
	public String getCpu10() {
		return cpu10;
	}
	/**
	 * 设置：
	 */
	public void setCpu11(String cpu11) {
		this.cpu11 = cpu11;
	}
	/**
	 * 获取：
	 */
	public String getCpu11() {
		return cpu11;
	}
	/**
	 * 设置：
	 */
	public void setCpu12(String cpu12) {
		this.cpu12 = cpu12;
	}
	/**
	 * 获取：
	 */
	public String getCpu12() {
		return cpu12;
	}
	/**
	 * 设置：
	 */
	public void setCpu13(String cpu13) {
		this.cpu13 = cpu13;
	}
	/**
	 * 获取：
	 */
	public String getCpu13() {
		return cpu13;
	}
	/**
	 * 设置：
	 */
	public void setCpu14(String cpu14) {
		this.cpu14 = cpu14;
	}
	/**
	 * 获取：
	 */
	public String getCpu14() {
		return cpu14;
	}
	/**
	 * 设置：
	 */
	public void setCpu15(String cpu15) {
		this.cpu15 = cpu15;
	}
	/**
	 * 获取：
	 */
	public String getCpu15() {
		return cpu15;
	}
	/**
	 * 设置：
	 */
	public void setCpu16(String cpu16) {
		this.cpu16 = cpu16;
	}
	/**
	 * 获取：
	 */
	public String getCpu16() {
		return cpu16;
	}
	/**
	 * 设置：
	 */
	public void setCpu17(String cpu17) {
		this.cpu17 = cpu17;
	}
	/**
	 * 获取：
	 */
	public String getCpu17() {
		return cpu17;
	}
	/**
	 * 设置：
	 */
	public void setCpu18(String cpu18) {
		this.cpu18 = cpu18;
	}
	/**
	 * 获取：
	 */
	public String getCpu18() {
		return cpu18;
	}
	/**
	 * 设置：
	 */
	public void setCpu19(String cpu19) {
		this.cpu19 = cpu19;
	}
	/**
	 * 获取：
	 */
	public String getCpu19() {
		return cpu19;
	}
	/**
	 * 设置：
	 */
	public void setCpu20(String cpu20) {
		this.cpu20 = cpu20;
	}
	/**
	 * 获取：
	 */
	public String getCpu20() {
		return cpu20;
	}
	/**
	 * 设置：
	 */
	public void setCpu21(String cpu21) {
		this.cpu21 = cpu21;
	}
	/**
	 * 获取：
	 */
	public String getCpu21() {
		return cpu21;
	}
	/**
	 * 设置：
	 */
	public void setCpu22(String cpu22) {
		this.cpu22 = cpu22;
	}
	/**
	 * 获取：
	 */
	public String getCpu22() {
		return cpu22;
	}
	/**
	 * 设置：
	 */
	public void setCpu23(String cpu23) {
		this.cpu23 = cpu23;
	}
	/**
	 * 获取：
	 */
	public String getCpu23() {
		return cpu23;
	}
	/**
	 * 设置：
	 */
	public void setCpu24(String cpu24) {
		this.cpu24 = cpu24;
	}
	/**
	 * 获取：
	 */
	public String getCpu24() {
		return cpu24;
	}
	/**
	 * 设置：
	 */
	public void setCpu25(String cpu25) {
		this.cpu25 = cpu25;
	}
	/**
	 * 获取：
	 */
	public String getCpu25() {
		return cpu25;
	}
	/**
	 * 设置：
	 */
	public void setCpu26(String cpu26) {
		this.cpu26 = cpu26;
	}
	/**
	 * 获取：
	 */
	public String getCpu26() {
		return cpu26;
	}
	/**
	 * 设置：
	 */
	public void setCpu27(String cpu27) {
		this.cpu27 = cpu27;
	}
	/**
	 * 获取：
	 */
	public String getCpu27() {
		return cpu27;
	}
	/**
	 * 设置：
	 */
	public void setCpu28(String cpu28) {
		this.cpu28 = cpu28;
	}
	/**
	 * 获取：
	 */
	public String getCpu28() {
		return cpu28;
	}
	/**
	 * 设置：
	 */
	public void setCpu29(String cpu29) {
		this.cpu29 = cpu29;
	}
	/**
	 * 获取：
	 */
	public String getCpu29() {
		return cpu29;
	}
	/**
	 * 设置：
	 */
	public void setCpu30(String cpu30) {
		this.cpu30 = cpu30;
	}
	/**
	 * 获取：
	 */
	public String getCpu30() {
		return cpu30;
	}
	/**
	 * 设置：
	 */
	public void setCpu31(String cpu31) {
		this.cpu31 = cpu31;
	}
	/**
	 * 获取：
	 */
	public String getCpu31() {
		return cpu31;
	}
	/**
	 * 设置：
	 */
	public void setCpu32(String cpu32) {
		this.cpu32 = cpu32;
	}
	/**
	 * 获取：
	 */
	public String getCpu32() {
		return cpu32;
	}
	/**
	 * 设置：
	 */
	public void setCpu33(String cpu33) {
		this.cpu33 = cpu33;
	}
	/**
	 * 获取：
	 */
	public String getCpu33() {
		return cpu33;
	}
	/**
	 * 设置：
	 */
	public void setCpu34(String cpu34) {
		this.cpu34 = cpu34;
	}
	/**
	 * 获取：
	 */
	public String getCpu34() {
		return cpu34;
	}
	/**
	 * 设置：
	 */
	public void setCpu35(String cpu35) {
		this.cpu35 = cpu35;
	}
	/**
	 * 获取：
	 */
	public String getCpu35() {
		return cpu35;
	}
	/**
	 * 设置：
	 */
	public void setCpu36(String cpu36) {
		this.cpu36 = cpu36;
	}
	/**
	 * 获取：
	 */
	public String getCpu36() {
		return cpu36;
	}
	/**
	 * 设置：
	 */
	public void setCpu37(String cpu37) {
		this.cpu37 = cpu37;
	}
	/**
	 * 获取：
	 */
	public String getCpu37() {
		return cpu37;
	}
	/**
	 * 设置：
	 */
	public void setCpu38(String cpu38) {
		this.cpu38 = cpu38;
	}
	/**
	 * 获取：
	 */
	public String getCpu38() {
		return cpu38;
	}
	/**
	 * 设置：
	 */
	public void setCpu39(String cpu39) {
		this.cpu39 = cpu39;
	}
	/**
	 * 获取：
	 */
	public String getCpu39() {
		return cpu39;
	}
	/**
	 * 设置：
	 */
	public void setCpu40(String cpu40) {
		this.cpu40 = cpu40;
	}
	/**
	 * 获取：
	 */
	public String getCpu40() {
		return cpu40;
	}
	/**
	 * 设置：
	 */
	public void setCpu41(String cpu41) {
		this.cpu41 = cpu41;
	}
	/**
	 * 获取：
	 */
	public String getCpu41() {
		return cpu41;
	}
	/**
	 * 设置：
	 */
	public void setCpu42(String cpu42) {
		this.cpu42 = cpu42;
	}
	/**
	 * 获取：
	 */
	public String getCpu42() {
		return cpu42;
	}
	/**
	 * 设置：
	 */
	public void setCpu43(String cpu43) {
		this.cpu43 = cpu43;
	}
	/**
	 * 获取：
	 */
	public String getCpu43() {
		return cpu43;
	}
	/**
	 * 设置：
	 */
	public void setCpu44(String cpu44) {
		this.cpu44 = cpu44;
	}
	/**
	 * 获取：
	 */
	public String getCpu44() {
		return cpu44;
	}
	/**
	 * 设置：
	 */
	public void setCpu45(String cpu45) {
		this.cpu45 = cpu45;
	}
	/**
	 * 获取：
	 */
	public String getCpu45() {
		return cpu45;
	}
	/**
	 * 设置：
	 */
	public void setCpu46(String cpu46) {
		this.cpu46 = cpu46;
	}
	/**
	 * 获取：
	 */
	public String getCpu46() {
		return cpu46;
	}
	/**
	 * 设置：
	 */
	public void setCpu47(String cpu47) {
		this.cpu47 = cpu47;
	}
	/**
	 * 获取：
	 */
	public String getCpu47() {
		return cpu47;
	}
	/**
	 * 设置：
	 */
	public void setCpu48(String cpu48) {
		this.cpu48 = cpu48;
	}
	/**
	 * 获取：
	 */
	public String getCpu48() {
		return cpu48;
	}
	/**
	 * 设置：
	 */
	public void setCpu49(String cpu49) {
		this.cpu49 = cpu49;
	}
	/**
	 * 获取：
	 */
	public String getCpu49() {
		return cpu49;
	}
	/**
	 * 设置：
	 */
	public void setCpu50(String cpu50) {
		this.cpu50 = cpu50;
	}
	/**
	 * 获取：
	 */
	public String getCpu50() {
		return cpu50;
	}
	/**
	 * 设置：
	 */
	public void setCpu51(String cpu51) {
		this.cpu51 = cpu51;
	}
	/**
	 * 获取：
	 */
	public String getCpu51() {
		return cpu51;
	}
	/**
	 * 设置：
	 */
	public void setCpu52(String cpu52) {
		this.cpu52 = cpu52;
	}
	/**
	 * 获取：
	 */
	public String getCpu52() {
		return cpu52;
	}
	/**
	 * 设置：
	 */
	public void setCpu53(String cpu53) {
		this.cpu53 = cpu53;
	}
	/**
	 * 获取：
	 */
	public String getCpu53() {
		return cpu53;
	}
	/**
	 * 设置：
	 */
	public void setCpu54(String cpu54) {
		this.cpu54 = cpu54;
	}
	/**
	 * 获取：
	 */
	public String getCpu54() {
		return cpu54;
	}
	/**
	 * 设置：
	 */
	public void setCpu55(String cpu55) {
		this.cpu55 = cpu55;
	}
	/**
	 * 获取：
	 */
	public String getCpu55() {
		return cpu55;
	}
	/**
	 * 设置：
	 */
	public void setCpu56(String cpu56) {
		this.cpu56 = cpu56;
	}
	/**
	 * 获取：
	 */
	public String getCpu56() {
		return cpu56;
	}
	/**
	 * 设置：
	 */
	public void setCpu57(String cpu57) {
		this.cpu57 = cpu57;
	}
	/**
	 * 获取：
	 */
	public String getCpu57() {
		return cpu57;
	}
	/**
	 * 设置：
	 */
	public void setCpu58(String cpu58) {
		this.cpu58 = cpu58;
	}
	/**
	 * 获取：
	 */
	public String getCpu58() {
		return cpu58;
	}
	/**
	 * 设置：
	 */
	public void setCpu59(String cpu59) {
		this.cpu59 = cpu59;
	}
	/**
	 * 获取：
	 */
	public String getCpu59() {
		return cpu59;
	}
	/**
	 * 设置：
	 */
	public void setCpu60(String cpu60) {
		this.cpu60 = cpu60;
	}
	/**
	 * 获取：
	 */
	public String getCpu60() {
		return cpu60;
	}
	/**
	 * 设置：
	 */
	public void setCpu61(String cpu61) {
		this.cpu61 = cpu61;
	}
	/**
	 * 获取：
	 */
	public String getCpu61() {
		return cpu61;
	}
	/**
	 * 设置：
	 */
	public void setCpu62(String cpu62) {
		this.cpu62 = cpu62;
	}
	/**
	 * 获取：
	 */
	public String getCpu62() {
		return cpu62;
	}
	/**
	 * 设置：
	 */
	public void setCpu63(String cpu63) {
		this.cpu63 = cpu63;
	}
	/**
	 * 获取：
	 */
	public String getCpu63() {
		return cpu63;
	}
	/**
	 * 设置：
	 */
	public void setCpu64(String cpu64) {
		this.cpu64 = cpu64;
	}
	/**
	 * 获取：
	 */
	public String getCpu64() {
		return cpu64;
	}
	/**
	 * 设置：
	 */
	public void setCpu65(String cpu65) {
		this.cpu65 = cpu65;
	}
	/**
	 * 获取：
	 */
	public String getCpu65() {
		return cpu65;
	}
	/**
	 * 设置：
	 */
	public void setCpu66(String cpu66) {
		this.cpu66 = cpu66;
	}
	/**
	 * 获取：
	 */
	public String getCpu66() {
		return cpu66;
	}
	/**
	 * 设置：
	 */
	public void setCpu67(String cpu67) {
		this.cpu67 = cpu67;
	}
	/**
	 * 获取：
	 */
	public String getCpu67() {
		return cpu67;
	}
	/**
	 * 设置：
	 */
	public void setCpu68(String cpu68) {
		this.cpu68 = cpu68;
	}
	/**
	 * 获取：
	 */
	public String getCpu68() {
		return cpu68;
	}
	/**
	 * 设置：
	 */
	public void setCpu69(String cpu69) {
		this.cpu69 = cpu69;
	}
	/**
	 * 获取：
	 */
	public String getCpu69() {
		return cpu69;
	}
	/**
	 * 设置：
	 */
	public void setCpu70(String cpu70) {
		this.cpu70 = cpu70;
	}
	/**
	 * 获取：
	 */
	public String getCpu70() {
		return cpu70;
	}
	/**
	 * 设置：
	 */
	public void setCpu71(String cpu71) {
		this.cpu71 = cpu71;
	}
	/**
	 * 获取：
	 */
	public String getCpu71() {
		return cpu71;
	}
	/**
	 * 设置：
	 */
	public void setCpu72(String cpu72) {
		this.cpu72 = cpu72;
	}
	/**
	 * 获取：
	 */
	public String getCpu72() {
		return cpu72;
	}
	/**
	 * 设置：
	 */
	public void setCpu73(String cpu73) {
		this.cpu73 = cpu73;
	}
	/**
	 * 获取：
	 */
	public String getCpu73() {
		return cpu73;
	}
	/**
	 * 设置：
	 */
	public void setCpu74(String cpu74) {
		this.cpu74 = cpu74;
	}
	/**
	 * 获取：
	 */
	public String getCpu74() {
		return cpu74;
	}
	/**
	 * 设置：
	 */
	public void setCpu75(String cpu75) {
		this.cpu75 = cpu75;
	}
	/**
	 * 获取：
	 */
	public String getCpu75() {
		return cpu75;
	}
	/**
	 * 设置：
	 */
	public void setCpu76(String cpu76) {
		this.cpu76 = cpu76;
	}
	/**
	 * 获取：
	 */
	public String getCpu76() {
		return cpu76;
	}
	/**
	 * 设置：
	 */
	public void setCpu77(String cpu77) {
		this.cpu77 = cpu77;
	}
	/**
	 * 获取：
	 */
	public String getCpu77() {
		return cpu77;
	}
	/**
	 * 设置：
	 */
	public void setCpu78(String cpu78) {
		this.cpu78 = cpu78;
	}
	/**
	 * 获取：
	 */
	public String getCpu78() {
		return cpu78;
	}
	/**
	 * 设置：
	 */
	public void setCpu79(String cpu79) {
		this.cpu79 = cpu79;
	}
	/**
	 * 获取：
	 */
	public String getCpu79() {
		return cpu79;
	}
	/**
	 * 设置：
	 */
	public void setCpu80(String cpu80) {
		this.cpu80 = cpu80;
	}
	/**
	 * 获取：
	 */
	public String getCpu80() {
		return cpu80;
	}
	/**
	 * 设置：
	 */
	public void setCpu81(String cpu81) {
		this.cpu81 = cpu81;
	}
	/**
	 * 获取：
	 */
	public String getCpu81() {
		return cpu81;
	}
	/**
	 * 设置：
	 */
	public void setCpu82(String cpu82) {
		this.cpu82 = cpu82;
	}
	/**
	 * 获取：
	 */
	public String getCpu82() {
		return cpu82;
	}
	/**
	 * 设置：
	 */
	public void setCpu83(String cpu83) {
		this.cpu83 = cpu83;
	}
	/**
	 * 获取：
	 */
	public String getCpu83() {
		return cpu83;
	}
	/**
	 * 设置：
	 */
	public void setCpu84(String cpu84) {
		this.cpu84 = cpu84;
	}
	/**
	 * 获取：
	 */
	public String getCpu84() {
		return cpu84;
	}
	/**
	 * 设置：
	 */
	public void setCpu85(String cpu85) {
		this.cpu85 = cpu85;
	}
	/**
	 * 获取：
	 */
	public String getCpu85() {
		return cpu85;
	}
	/**
	 * 设置：
	 */
	public void setCpu86(String cpu86) {
		this.cpu86 = cpu86;
	}
	/**
	 * 获取：
	 */
	public String getCpu86() {
		return cpu86;
	}
	/**
	 * 设置：
	 */
	public void setCpu87(String cpu87) {
		this.cpu87 = cpu87;
	}
	/**
	 * 获取：
	 */
	public String getCpu87() {
		return cpu87;
	}
	/**
	 * 设置：
	 */
	public void setCpu88(String cpu88) {
		this.cpu88 = cpu88;
	}
	/**
	 * 获取：
	 */
	public String getCpu88() {
		return cpu88;
	}
	/**
	 * 设置：
	 */
	public void setCpu89(String cpu89) {
		this.cpu89 = cpu89;
	}
	/**
	 * 获取：
	 */
	public String getCpu89() {
		return cpu89;
	}
	/**
	 * 设置：
	 */
	public void setCpu90(String cpu90) {
		this.cpu90 = cpu90;
	}
	/**
	 * 获取：
	 */
	public String getCpu90() {
		return cpu90;
	}
	/**
	 * 设置：
	 */
	public void setCpu91(String cpu91) {
		this.cpu91 = cpu91;
	}
	/**
	 * 获取：
	 */
	public String getCpu91() {
		return cpu91;
	}
	/**
	 * 设置：
	 */
	public void setCpu92(String cpu92) {
		this.cpu92 = cpu92;
	}
	/**
	 * 获取：
	 */
	public String getCpu92() {
		return cpu92;
	}
	/**
	 * 设置：
	 */
	public void setCpu93(String cpu93) {
		this.cpu93 = cpu93;
	}
	/**
	 * 获取：
	 */
	public String getCpu93() {
		return cpu93;
	}
	/**
	 * 设置：
	 */
	public void setCpu94(String cpu94) {
		this.cpu94 = cpu94;
	}
	/**
	 * 获取：
	 */
	public String getCpu94() {
		return cpu94;
	}
	/**
	 * 设置：
	 */
	public void setCpu95(String cpu95) {
		this.cpu95 = cpu95;
	}
	/**
	 * 获取：
	 */
	public String getCpu95() {
		return cpu95;
	}
	/**
	 * 设置：
	 */
	public void setCpu96(String cpu96) {
		this.cpu96 = cpu96;
	}
	/**
	 * 获取：
	 */
	public String getCpu96() {
		return cpu96;
	}
	/**
	 * 设置：
	 */
	public void setCpu97(String cpu97) {
		this.cpu97 = cpu97;
	}
	/**
	 * 获取：
	 */
	public String getCpu97() {
		return cpu97;
	}
	/**
	 * 设置：
	 */
	public void setCpu98(String cpu98) {
		this.cpu98 = cpu98;
	}
	/**
	 * 获取：
	 */
	public String getCpu98() {
		return cpu98;
	}
	/**
	 * 设置：
	 */
	public void setCpu99(String cpu99) {
		this.cpu99 = cpu99;
	}
	/**
	 * 获取：
	 */
	public String getCpu99() {
		return cpu99;
	}
	/**
	 * 设置：总的CPU使用率
	 */
	public void setCputotalRate(String cputotalRate) {
		this.cputotalRate = cputotalRate;
	}
	/**
	 * 获取：总的CPU使用率
	 */
	public String getCputotalRate() {
		return cputotalRate;
	}
	/**
	 * 设置：
	 */
	public void setReserve0(String reserve0) {
		this.reserve0 = reserve0;
	}
	/**
	 * 获取：
	 */
	public String getReserve0() {
		return reserve0;
	}
	/**
	 * 设置：
	 */
	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}
	/**
	 * 获取：
	 */
	public String getReserve1() {
		return reserve1;
	}
	/**
	 * 设置：是否异常：1-异常  0-正常
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：是否异常：1-异常  0-正常
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：记录时间
	 */
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	/**
	 * 获取：记录时间
	 */
	public Date getRecordtime() {
		return recordtime;
	}
}
