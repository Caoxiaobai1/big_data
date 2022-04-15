package com.ihrm.domain.company;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.ToString;

/**
 * <p>
 * 
 * </p>
 *
 * @author cyf
 * @since 2022-04-15
 */
@Data
@TableName("co_company")
@Schema(name = "Company对象", description = "Company对象")
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(name = "id",description = "ID")
    private String id;

    @Schema(name = "name",description = "公司名称")
    private String name;

    @Schema(name ="managerId",description = "公司名称")
    private String managerId;

    @Schema(name ="version",description = "公司名称")
    private String version;

    @Schema(name ="renewalDate",description = "公司名称")
    private LocalDateTime renewalDate;

    @Schema(name ="expirationDate",description = "公司名称")
    private LocalDateTime expirationDate;

    @Schema(name ="companyArea",description = "公司名称")
    private String companyArea;

    @Schema(name ="companyAddress",description = "公司名称")
    private String companyAddress;

    @Schema(name ="businessLicenseId",description = "公司名称")
    private String businessLicenseId;

    @Schema(name ="legalRepresentative",description = "公司名称")
    private String legalRepresentative;

    @Schema(name ="companyPhone",description = "公司名称")
    private String companyPhone;

    @Schema(name ="mailbox",description = "公司名称")
    private String mailbox;

    @Schema(name ="companySize",description = "公司名称")
    private String companySize;

    @Schema(name ="industry",description = "公司名称")
    private String industry;

    @Schema(name ="remarks",description = "公司名称")
    private String remarks;

    @Schema(name ="auditState",description = "公司名称")
    private String auditState;

    @Schema(name ="state",description = "公司名称")
    private Integer state;

    @Schema(name ="balance",description = "公司名称")
    private Double balance;

    @Schema(name ="createTime",description = "公司名称")
    private LocalDateTime createTime;


}
