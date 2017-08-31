package com.blw.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_supply_product")
public class SupplyProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 供应商公司code
     */
    @Column(name = "supply_company")
    private String supplyCompany;

    /**
     * 液厂id
     */
    @Column(name = "lng_factory_id")
    private String lngFactoryId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "del_flg")
    private String delFlg;

    /**
     * 商品名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 采购商公司
     */
    @Column(name = "company_code")
    private String companyCode;

    /**
     * 操作人
     */
    @Column(name = "handle_user_code")
    private String handleUserCode;

    /**
     * 商品code
     */
    @Column(name = "supply_product_code")
    private String supplyProductCode;

    /**
     * 是否提供运输服务 0：否， 1：是
     */
    private String type;

    /**
     * 物流单价模板
     */
    @Column(name = "carrier_id")
    private String carrierId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取供应商公司code
     *
     * @return supply_company - 供应商公司code
     */
    public String getSupplyCompany() {
        return supplyCompany;
    }

    /**
     * 设置供应商公司code
     *
     * @param supplyCompany 供应商公司code
     */
    public void setSupplyCompany(String supplyCompany) {
        this.supplyCompany = supplyCompany == null ? null : supplyCompany.trim();
    }

    /**
     * 获取液厂id
     *
     * @return lng_factory_id - 液厂id
     */
    public String getLngFactoryId() {
        return lngFactoryId;
    }

    /**
     * 设置液厂id
     *
     * @param lngFactoryId 液厂id
     */
    public void setLngFactoryId(String lngFactoryId) {
        this.lngFactoryId = lngFactoryId == null ? null : lngFactoryId.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return del_flg
     */
    public String getDelFlg() {
        return delFlg;
    }

    /**
     * @param delFlg
     */
    public void setDelFlg(String delFlg) {
        this.delFlg = delFlg == null ? null : delFlg.trim();
    }

    /**
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * 获取采购商公司
     *
     * @return company_code - 采购商公司
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * 设置采购商公司
     *
     * @param companyCode 采购商公司
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode == null ? null : companyCode.trim();
    }

    /**
     * 获取操作人
     *
     * @return handle_user_code - 操作人
     */
    public String getHandleUserCode() {
        return handleUserCode;
    }

    /**
     * 设置操作人
     *
     * @param handleUserCode 操作人
     */
    public void setHandleUserCode(String handleUserCode) {
        this.handleUserCode = handleUserCode == null ? null : handleUserCode.trim();
    }

    /**
     * 获取商品code
     *
     * @return supply_product_code - 商品code
     */
    public String getSupplyProductCode() {
        return supplyProductCode;
    }

    /**
     * 设置商品code
     *
     * @param supplyProductCode 商品code
     */
    public void setSupplyProductCode(String supplyProductCode) {
        this.supplyProductCode = supplyProductCode == null ? null : supplyProductCode.trim();
    }

    /**
     * 获取是否提供运输服务 0：否， 1：是
     *
     * @return type - 是否提供运输服务 0：否， 1：是
     */
    public String getType() {
        return type;
    }

    /**
     * 设置是否提供运输服务 0：否， 1：是
     *
     * @param type 是否提供运输服务 0：否， 1：是
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 获取物流单价模板
     *
     * @return carrier_id - 物流单价模板
     */
    public String getCarrierId() {
        return carrierId;
    }

    /**
     * 设置物流单价模板
     *
     * @param carrierId 物流单价模板
     */
    public void setCarrierId(String carrierId) {
        this.carrierId = carrierId == null ? null : carrierId.trim();
    }
}