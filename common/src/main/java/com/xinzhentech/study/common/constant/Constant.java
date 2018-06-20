package com.xinzhentech.study.common.constant;

import java.math.BigDecimal;


/**
 * 常用变量类
 */
public final class Constant {

    /******************** 常量数字 ***********/
    public static final int INT_ONE_NEGA = -1;

    /**
     * 字符串 ，0
     */
    public static final String STRING_ZERO = "0";
    /**
     * 字符串 ，1
     */
    public static final String STRING_ONE = "1";
    /**
     * 字符串 ，2
     */
    public static final String STRING_TWO = "2";
    /**
     * 字符串 ，3
     */
    public static final String STRING_THREE = "3";
    /**
     * 字符串 ，4
     */
    public static final String STRING_FOUR = "4";
    /**
     * 字符串 ，5
     */
    public static final String STRING_FIVE = "5";
    /**
     * 字符串 ，122
     */
    public static final String STRING_ONETWOTWO = "122";
    /**
     * 字符串 ，5
     */
    public static final String STRING_ONETWOFOUR = "124";
    /**
     * 字符串 ，198
     */
    public static final String STRING_ONENINEEIGHT = "198";
    /**
     * 数字 ，0
     */
    public static final int INT_ZERO = 0;
    /**
     * 数字 ，1
     */
    public static final int INT_ONE = 1;
    /**
     * 数字 ，2
     */
    public static final int INT_TWO = 2;
    /**
     * 数字 ，3
     */
    public static final int INT_THREE = 3;
    /**
     * 数字 ，4
     */
    public static final int INT_FOUR = 4;
    /**
     * 数字 ，5
     */
    public static final int INT_FIVE = 5;
    /**
     * 数字 ，-5
     */
    public static final int INT_FIVE_NEGE = -5;
    /**
     * 数字 ，6
     */
    public static final int INT_SIX = 6;
    /**
     * 数字 ，-6
     */
    public static final int INT_SIX_NEGE = -6;
    /**
     * 数字 ，7
     */
    public static final int INT_SEVEN = 7;
    /**
     * 数字 , 8
     */
    public static final int INT_EIGHT = 8;
    /**
     * 数字 ，10
     */
    public static final int INT_TEN = 10;
    /**
     * 数字 ，12
     */
    public static final int INT_TWELVE = 12;
    /**
     * 数字 ，13
     */
    public static final int INT_THIRTEEN = 13;
    /**
     * 数字 ，15
     */
    public static final int INT_FIFTEEN = 15;

    /**
     * 数字 ，18
     */
    public static final int INT_EIGHTEEN = 18;
    /**
     * 数字 ，30
     */
    public static final int INT_THIRTING = 30;
    /**
     * 数字 ，-31
     */
    public static final int INT_THIRTING_NEGE = -31;

    /**
     * 数字 ，50
     */
    public static final int INT_FIFTY = 50;
    /**
     * 数字 ，60
     */
    public static final int INT_SIXTEN = 60;
    /**
     * 数字 ，100
     */
    public static final int INT_ONE_HUNDRED = 100;
    /**
     * 数字 ，128
     */
    public static final int INT_ONE_HUNDRED_TWENY_EIGHT = 128;
    /**
     * 数字 ,200
     */
    public static final int INT_TWO_HUNDRED = 200;
    /**
     * 数字 ,1000
     */
    public static final int INT_ONE_THOUSAND = 1000;
    /**
     * 数字 ,5000
     */
    public static final int INT_FIVE_THOUSAND = 5000;

    /**
     * 数字 ,10000
     */
    public static final int INT_TEN_THOUSAND = 10000;

    /**
     * 数字 ,1000000
     */
    public static final int ONE_MILLION = 1000000;

    /**
     * double数字 ,1.0
     */
    public static final double DOUBLE_ONE = 1.0;
    /**
     * double数字 ,2.0
     */
    public static final double DOUBLE_TWO = 2.0;
    /**
     * double数字 ,0.0
     */
    public static final double DOUBLE_ZERO = 0.0;
    /**
     * double数字 ,-1.0
     */
    public static final double DOUBLE_ONE_NEGE = -1.0;
    /**
     * double数字 ,100.0
     */
    public static final double DOUBLE_ONE_HUNDRED = 100.0;
    /**
     * double数字 ,-100.0
     */
    public static final double DOUBLE_ONE_HUNDRED_NEGA = -100.0;
    /**
     * double数字 ,99.99
     */
    public static final double DOUBLE_FOUR_NINE_PERCENT = 99.99;

    /**
     * 编码格式UTF-8
     */
    public static final String CHARSET = "UTF-8";
    /**
     * 邮箱最大长度
     */
    public static final int MAIL_MAX_LENGTH = 50;

    /**
     * 文章详情最大长度
     */
    public static final int ATRCILE_CONTENT_MAX_LENGTH = 2000;

    /****************** 数据库实体类String长度 start ******************/
    /**
     * 数据库实体字段长度16
     */
    public static final int ENTITY_LENGTH_ZERO = 16;

    /**
     * 数据库实体字段长度32
     */
    public static final int ENTITY_LENGTH_ONE = 32;
    /**
     * 数据库实体字段长度64
     */
    public static final int ENTITY_LENGTH_TWO = 64;
    /**
     * 数据库实体字段长度128
     */
    public static final int ENTITY_LENGTH_THREE = 128;

    /**
     * 数据库实体字段长度256
     */
    public static final int ENTITY_LENGTH_FOUR = 256;
    /**
     * 数据库实体字段长度512
     */
    public static final int ENTITY_LENGTH_FIVE = 512;
    /**
     * 数据库实体字段长度1024
     */
    public static final int ENTITY_LENGTH_SIX = 1024;
    /****************** 数据库实体类String长度 end ******************/

    /**
     * 一次批量操作的数据量
     */
    public static final int BATCH_OPERATION_COUNT = 50;


    /****************** 第三方托管常量 start ******************/

    /*********************** session ****************************************/

    /**
     * 用户
     */
    public static final String SESSION_USER = "session_user";
    /**
     * 用户
     */
    public static final String SESSION_USER_NEW = "session_user_new";
    /**
     * 用户认证状态
     */
    public static final String SESSION_USER_IDENTIFY = "session_user_identify";
    /**
     * 用户附属信息
     */
    public static final String SESSION_USER_CACHE = "session_user_cache";
    /**
     * 后台操作员
     */
    public static final String SESSION_OPERATOR = "session_operator";
    /**
     * 企业logo路径
     */
    public static final String SESSION_COMPANY_LOGO_PATH = "session_company_logo_path";
    /**
     * 图片验证码
     */
    public static final String VALID_CODE = "validCode";
    /**
     * 登录时间
     */
    public static final String LOGIN_TIME = "login_time";
    /**
     * 找回密码标识
     **/
    public static final String RETRIEVEPASS_SIGN = "retrievepwdSign";
    /**
     * 用户密码错误失败存放的rediskey
     */
    public static final String LOGIN_FAIL_MAP = "loginFailMap";
    public static final int LOGIN_FAIL_NUM = 5;

    public static final String SESSION_TPP_ACCOUNT = "session_tpp_account";


    /*********************** 流程定义文件存放路径 workflow(activiti) ****************************************/
    /**
     * 资源路径名称
     */
    public static final String PROCESS_RESOURCES = "/activiti-process/";
    /**
     * 常用业务关键属性
     */
    public static final String PROCESS_BUSINESS_ID = "business_id";
    public static final String PROCESS_BUSINESS_TITLE = "business_title";
    public static final String PROCESS_BUSINESS_CREATOR = "business_creator";
    /**
     * 工作项创建事件
     */
    public static final String EVENT_CREATE = "create";
    /**
     * 工作项完成事件
     */
    public static final String EVENT_COMPETE = "compete";
    public static final String DEFAULT_ROLE_STRING = "ROLE";


    /*********************** 系统配置表常量 ****************************************/
    /**
     * 刷新时间
     */
    public static final String LOGIN_ERROR_FALSH_TIME = "login_error_flash_time";
    /**
     * 账户锁定时间，单位为秒
     */
    public static final String ACCOUNT_LOCK_TIME = "account_lock_time";
    /**
     * 超级管理员的编号
     */
    public static final String ROLE_CODE_ADMIN = "admin";

    public static final String DEFAULT_INDEX_MENU_ID = "1";

    public static final Integer LEAF_VALUE = 1;  //叶子节点

    public static final String SPEC_CHAR = "|"; //特殊字符
    /**
     * 平台交易方ID
     */
    public static final String ADMIN_ID = "admin_account";
    /**
     * UFX商户号
     */
    public static final String UFX_CUSTOMERID = "ufx_customerId";
    /**
     * 交易方投资人
     */
    public static final String TO_USER_INVEST = "2";
    /**
     * 充值/提现交易方
     */
    public static final String TO_USER_NULL = "--";
    /****************** 常用状态 start  ************************/
    /**
     * String 1
     */
    public static final String FLAG_YES = "1";

    public static final String ISIDENTIY = "Y";

    public static final String ISIDENTIN = "N";
    /**
     * String 0
     */
    public static final String FLAG_NO = "0";
    public static final int FLAG_INT_YES = 1;
    public static final int FLAG_INT_NO = 0;
    /**
     * 启用
     */
    public static final String ENABLE = "1";
    /**
     * 禁用
     */
    public static final String DISABLED = "0";
    /****************** 常用状态 end  ************************/

    /****************** 用户状态 start  ************************/
    public static final String USER_STATUS_LOCK = "-1";  //锁定
    public static final String USER_STATUS_NORMAL = "0"; //正常
    /****************** 用户状态 end  ************************/

    /****************** 用户名前缀(不超过4位) start  ************************/
    public static final String USER_NAME_PREFIX = "xz";
    /****************** 用户名前缀 (不超过4位) end  ************************/

    public static final String TPP_LOGIN_URL = "/member/security/apiLogin.html";

    /****************** 日期查询范围  start  ************************/
    /**
     * 全部
     **/
    public static final String DATE_TYPE_ALL = "00";
    /**
     * 近一星期
     **/
    public static final String DATE_TYPE_WEEK = "01";
    /**
     * 近一月
     **/
    public static final String DATE_TYPE_MONTH = "02";
    /**
     * 近一季度
     **/
    public static final String DATE_TYPE_QUARTER = "03";
    /**
     * 近一年
     **/
    public static final String DATE_TYPE_YEAR = "04";

    /****************** 日期查询范围  end  **************************/

    /****************** 安全级别  start  **************************/
    /**
     * 高
     **/
    public static final BigDecimal SECURITY_LEVEL_HIGH = BigDecimal.valueOf(100);
    /**
     * 中
     **/
    public static final BigDecimal SECURITY_LEVEL_MIDDLE = BigDecimal.valueOf(90);
    /**
     * 低
     **/
    public static final BigDecimal SECURITY_LEVEL_LOW = BigDecimal.valueOf(50);
    /**
     * 中-担保用户
     **/
    public static final BigDecimal SECURITY_LEVEL_MIDDLE_VOUCH = BigDecimal.valueOf(80);
    /**
     * 低-担保用户
     **/
    public static final BigDecimal SECURITY_LEVEL_LOW_VOUCH = BigDecimal.valueOf(40);

    /****************** 安全级别  end  ****************************/

    /**
     * 认证类型-绑定
     **/
    public static final String MODIFYTYPE_BIND = "0";
    /**
     * 认证类型-修改
     **/
    public static final String MODIFYTYPE_EDIT = "1";

    /****************** 邮箱修改认证方式 start  ***********************/
    /**
     * 手机认证
     **/
    public static final String EMAIL_VALID_MOBILE = "01";
    /**
     * 邮箱认证
     **/
    public static final String EMAIL_VALID_EMAIL = "02";
    /**
     * 密保+身份证
     **/
    public static final String EMAIL_VALID_PASS = "03";
    /****************** 验证码认证方式 end  **************************/

    /****************** 手机修改认证方式 start  ***********************/
    /**
     * 手机认证
     **/
    public static final String MOBILE_VALID_MOBILE = "01";
    /**
     * 邮箱+身份证认证
     **/
    public static final String MOBILE_VALID_EMAIL_PERSON = "02";
    /**
     * 邮箱+密保认证
     **/
    public static final String MOBILE_VALID_EMAIL_COMPANY = "03";
    /**
     * 密保+身份证
     **/
    public static final String MOBILE_VALID_PASS_PERSON = "04";
    /****************** 验证码认证方式 end  **************************/

    /****************** 密保重置认证方式 start  ***********************/
    /**
     * 手机认证
     **/
    public static final String PASS_VALID_MOBILE = "01";
    /**
     * 邮箱认证
     **/
    public static final String PASS_VALID_EMAIL = "02";
    /****************** 验证码认证方式 end  **************************/

    /*******************密保问题签名字段  start***********************/
    public static final String RESET_PASS_QUEST = "reset_pwd_quest";
    /*******************密保问题签名字段  end*************************/

    /*******************地区字段  start***********************/
    public static final String AREA_CHINA = "0";
    /*******************地区字段  end*************************/

    /*******************下载协议所用秘钥，跟静态服务器保持一致  start***********************/
    public static final String TOKEN_CODE = "providebyxinzhen";
    /*******************下载协议所用秘钥，跟静态服务器保持一致  end***********************/

    /*******************账户常量  start***********************/
    /**
     * 账户编号 account_code
     **/
    public static final String ACCOUNT_CODE = "account_code";
    /**
     * 账户类型 account_type
     **/
    public static final String ACCOUNT_TYPE = "account_type";
    /*******************账户常量  end*************************/

    /*******************登录常量  start***********************/
    /**
     * 登陆错误锁定次数
     **/
    public static final String LOGIN_LOCK_NUMBER = "login_lock_number";
    /*******************登录常量 end***********************/

    /*******************图片地址常量  start***********************/
    public static final String PIC_PATH_BANK = "/data/bank/mini/";
    /*******************图片地址常量  start***********************/

    /*************红包加息券常量 start*****************/
    /**
     * 状态 未使用
     */
    public static final String STATUS_NO_USE = "0";
    /**
     * 状态 已经使用
     */
    public static final String STATUS_USE = "1";
    /**
     * 状态 已经过期
     */
    public static final String STATUS_EXPIRED = "2";
    /**
     * 状态 已经作废
     */
    public static final String STATUS_CANCEL = "3";

    /**************红包加息券常量 end****************************/
    /*******************取现常量 start***********************/
    public static final String CASH_STATUS_APPLY = "0";   //提现申请
    public static final String CASH_STATUS_PROCESS = "1"; //提现处理中
    public static final String CASH_STATUS_AUDIT = "2";   //提现待审核
    public static final String CASH_STATUS_SUCCESS = "3"; //提现成功
    public static final String CASH_STATUS_FAIL = "4";    //提现失败

    /***** 取现是否需要审核  *****/
    public static final int ACCOUNTCASH_NO_NEED_VERIFY = 0;
    public static final int ACCOUNTCASH_NEED_VERIFY = 1;

    /***** 取现是否需要人工核查  *****/
    /**
     * 人工核查：不需要
     */
    public static final String MAN_HANDLE_NO = "0";
    /**
     * 人工核查：待处理
     */
    public static final String MAN_HANDLE_NEED = "1";
    /**
     * 人工核查：已处理
     */
    public static final String MAN_HANDLE_CHECKED = "2";

    /*******************取现常量  end***********************/

    /*******************充值常量 start***********************/
    /**
     * 状态 -充值申请中
     **/
    public static final String RECHARGE_STATUS_APPLY = "0";
    /**
     * 状态 -充值成功
     **/
    public static final String RECHARGE_STATUS_SUCCESS = "1";
    /**
     * 状态 -充值失败
     **/
    public static final String RECHARGE_STATUS_FAIL = "2";

    /**
     * 手续承担方-个人
     **/
    public static final String FEE_TYPE_USER = "01";
    /**
     * 手续承担方-商户
     **/
    public static final String FEE_TYPE_MERCHANT = "02";
    /*******************充值常量 end***********************/
    /**
     * 三证合一用户
     */
    public static final String THREE_CERTIFICATE_YES = "1";
    /**
     * 非三证合一用户
     */
    public static final String THREE_CERTIFICATE_NO = "0";

    /**
     * 排序常量：逆序
     */
    public static final String DESC = "desc";
    /**
     * 排序常量：正序
     */
    public static final String ASC = "asc";
    /**
     * 消息状态：1发送成功
     */
    public static final Integer MESSAGE_STATUS_SUCCESS = 1;
    /**
     * 消息状态：2发送失败
     */
    public static final Integer MESSAGE_STATUS_FAIL = 2;
    /**
     * 第三方开通状态：1激活
     */
    public static final String TPP_STATUS_ACTIVE = "1";
    /**
     * 第三方开通状态：0未激活
     */
    public static final String TPP_STATUS_ACTIVE_NOT = "0";
    /**
     * 投资协议
     */
    public static final String PROTOCOL_TYPE_INVEST = "invest_protocol";
    /**
     * 绑卡协议
     */
    public static final String BIND_BANK_CARD_PROTOCOL = "bind_bank_card_protocol";
    /**
     * 注册协议
     */
    public static final String PROTOCOL_TYPE_REGISTER = "register_protocol";
    /**
     * 债权协议
     */
    public static final String PROTOCOL_TYPE_BOND_INVEST = "bond_invest_protocol";
    /**
     * 变现协议
     */
    public static final String PROTOCOL_TYPE_REALIZE_INVEST = "realize_invest_protocol";
    /**
     * 支付协议
     */
    public static final String PROTOCOL_TYPE_PAY = "pay_protocol";
    /**
     * 认证图片最多上传[{0}]张
     */
    public static final int USER_CENRIFICATION_MAX = 5;
    /**
     * 风险评估按钮
     */
    public static final String USER_RISK_PAPERS_CONTENT = "请进行风险评估";
    /**
     * 风险评估连接
     */
    public static final String USER_RISK_PAPERS_URL = "/member/risk/userRiskPapers.html";
    /**
     * 实名开户链接
     */
    public static final String USER_REAL_NAME_URL = "/member/security/realNameIdentify.html";
    /**
     * e签宝-横向文
     */
    public static final String SIGN_ACCOUNT_HTEXT = "111";
    /**
     * e签宝-下弦文
     */
    public static final String SIGN_ACCOUNT_QTEXT = "222";

    /**
     * 最小充值金额 recharge_min_amount
     */
    public static final String RECHARGE_MIN_AMNT = "recharge_min_amount";
    /**
     * 最大充值金额 recharge_max_amount
     */
    public static final String RECHARGE_MAX_AMNT = "recharge_max_amount";

    /**
     * 单日提现最大次数 cash_single_day_time_limit
     */
    public static final String CASH_DAY_TIME_LIMIT = "cash_single_day_time_limit";

    /**
     * 单笔提现额度限制 cash_single_max_amount_limit
     */
    public static final String CASH_SINGE_MAX_AMNT = "cash_single_max_amount_limit";

    /**
     * 单日提现额度限制 cash_single_day_max_amount_limit
     */
    public static final String CASH_DAY_MAX_AMNT = "cash_single_day_max_amount_limit";

    /**
     * 单笔最小提现金额 cash_min_amount
     */
    public static final String CASH_MIN_AMNT = "cash_min_amount";

    /**
     * 提现服务费 cash_serv_fee
     */
    public static final String CASH_SERV_FEE = "cash_serv_fee";

    /**
     * 提现是否需要审核 cash_need_audit
     */
    public static final String CASH_NEED_AUDIT = "cash_need_audit";

    /**
     * 个人提现是否需要审核 cash_need_audit_person
     */
    public static final String CASH_NEED_AUDIT_PERSON = "cash_need_audit_person";

    /**
     * 企业提现是否需要审核 cash_need_audit_company
     */
    public static final String CASH_NEED_AUDIT_COMPANY = "cash_need_audit_company";

    /**
     * 担保机构提现是否需要审核 cash_need_audit_vouch
     */
    public static final String CASH_NEED_AUDIT_VOUCH = "cash_need_audit_vouch";

    /**
     * 默认最大加息率
     */
    public static final String DEFAULT_BORROW_MOST_ADD_APR = "24";
/*********************** 用户资金日志类型：对应表sys_log_template code值 BEGIN ****************************************/

    /**
     * 投资成功,冻结
     */
    public static final String INVEST_FREEZE = "invest_freeze";
    /**
     * 投资成功,冻结
     */
    public static final String INVEST_REDENVELOPE_SUCCESS = "invest_redenvelope_success";
    /**
     * 投资成功(扣除冻结资金)
     */
    public static final String INVEST_SUCCESS = "invest_success";
    /**
     * 投资失败(解冻资金)
     */
    public static final String INVEST_UNFREEZE = "invest_unfreeze";
    /**
     * 充值成功
     */
    public static final String RECHARGE_SUCCESS_LOG = "recharge_success_log";

    /**
     * 冻结资金
     */
    public static final String FREEZE = "freeze";
    /**
     * 解冻资金
     */
    public static final String UNFREEZE = "unfreeze";
    /**
     * 借款入账
     */
    public static final String BORROW_SUCCESS = "borrow_success";
    /**
     * 借款手续费
     */
    public static final String BORROW_FEE = "borrow_fee";
    /**
     * 利息管理费
     */
    public static final String INTEREST_MANAGE_FEE = "interest_manage_fee";
    /**
     * 管理费(显示使用): 包括利息管理费、变现服务费、转让手续费、借款管理费、提现手续费
     */
    public static final String MANAGE_FEE = "manage_fee";
    /**
     * 还款本金
     */
    public static final String REPAID_CAPITAL = "repaid_capital";
    /**
     * 还款利息
     */
    public static final String REPAID_INTEREST = "repaid_interest";
    /**
     * 还款逾期利息
     */
    public static final String REPAID_LATE_INTEREST = "repaid_late_interest";
    /**
     * 逾期利息给平台
     */
    public static final String LATE_INTEREST_MERCHANT = "late_interest_merchant";
    /**
     * 还款逾期给平台利息
     */
    public static final String REPAID_MERCHANT_LATE_INTEREST = "repaid_merchant_late_interest";
    /**
     * 垫付成功
     */
    public static final String PAY_FOR_SUCCESS = "pay_for_success";
    /**
     * 垫付成功- 利息
     */
    public static final String PAY_FOR_SUCCESS_INTEREST = "pay_for_success_interest";
    /**
     * 垫付成功- 本金
     */
    public static final String PAY_FOR_SUCCESS_CAPITAL = "pay_for_success_capital";
    /**
     * 垫付成功- 逾期利息
     */
    public static final String PAY_FOR_SUCCESS_LATE_INTEREST = "pay_for_success_late_interest";
    /**
     * 垫付成功- 平台利息
     */
    public static final String PAY_FOR_SUCCESS_LATE_INTEREST_MERCHANT = "pay_for_success_late_interest_merchant";

    /**
     * 提现处理中
     */
    public static final String CASH_PROCCESS = "cash_proccess";
    /**
     * 提现待审核
     */
    public static final String CASH_AUDIT = "cash_audit";
    /**
     * 提现成功
     */
    public static final String CASH_SUCCESS = "cash_success";
    /**
     * 提现失败
     */
    public static final String CASH_FAIL = "cash_fail";
    /**
     * 提现银行对账失败
     */
    public static final String CASH_BANK_FAIL = "cash_bank_fail";
    /**
     * 提现审核成功
     */
    public static final String CASH_AUDIT_SUCCESS = "cash_audit_success";
    /**
     * 提现申请失败
     */
    public static final String CASH_SUBMIT_FAIL = "cash_submit_fail";
    /**
     * 本息收回（含罚息）
     */
    public static final String COLLECT_CAPITAL_INTEREST = "collect_capital_interest";
    /**
     * 本金收回
     */
    public static final String COLLECT_CAPITAL = "collect_capital";
    /**
     * 利息收回
     */
    public static final String COLLECT_INTEREST = "collect_interest";
    /**
     * 加息利息收回
     */
    public static final String COLLECT_ADD_INTEREST = "collect_add_interest";
    /**
     * 逾期利息收回
     */
    public static final String COLLECT_LATE_INTEREST = "collect_late_interest";
    /**
     * 逾期加息利息收回
     */
    public static final String REPAID_RAISE_INTEREST = "repaid_raise_interest";
    /**
     * 逾期利息平台收取
     */
    public static final String TYPE_OVERDUE_MERCHANT = "late_interest_merchant";

    /**
     * 冻结已变现本金
     */
    public static final String FREEZE_REALIZE_CAPITAL = "freeze_realize_capital";
    /**
     * 冻结已变现利息
     */
    public static final String FREEZE_REALIZE_INTEREST = "freeze_realize_interest";
    /**
     * 冻结已变现本息
     */
    public static final String FREEZE_REALIZE_CAPITAL_INTEREST = "freeze_realize_capital_interest";
    /**
     * 冻结逾期罚息
     */
    public static final String FREEZE_REALIZE_LATEINTEREST = "freeze_realize_lateinterest";
    /**
     * 解冻已变现金额
     */
    public static final String UNFREEZE_REALIZE_MONEY = "unfreeze_realize_money";
    /**
     * 变现进账
     */
    public static final String REALIZE_INCOME = "realize_income";
    /**
     * 变现管理费
     */
    public static final String REALIZE_MANAGEFEE = "realize_managefee";

    /**
     * 债权转让  受让人支付实际支付金额购买债权
     */
    public static final String BOND_BUY = "bond_buy";
    /**
     * 债权转让  受让人支付手续费购买债权
     */
    public static final String BOND_BUY_FEE = "bond_buy_fee";
    /**
     * 债权转让  转让手续费
     */
    public static final String BOND_PAY_FEE = "bond_pay_fee";
    /**
     * 债权转让  转让本金收回
     */
    public static final String BOND_PREMIUM_PROFITS = "bond_premium_profits";
    /**
     * 债权转让  转让本金收回
     */
    public static final String BOND_PREMIUM_LOSS = "bond_premium_loss";
    /**
     * 债权转让  转让本金收回
     */
    public static final String BOND_CAPITAL_BACK = "bond_capital_back";
    /**
     * 债权转让   转让人得到收益可负
     */
    public static final String BOND_SELL_DUCT = "bond_sell_duct";
    /**
     * 债权转让   转让人得到收益可正
     */
    public static final String BOND_SELL_EARN = "bond_sell_earn";
    /**
     * 债权转让出让人归还本金
     */
    public static final String BOND_SELL_CAPITAL = "bond_sell_capital";

    /**
     * 债权转让出让人收回利息
     */
    public static final String BOND_SELL_INTEREST = "bond_sell_interest";
    /**
     * 债权转让出让人收回溢价收益
     */
    public static final String BOND_SELL_PREMIUM = "bond_sell_premium";
    /**
     * 生利宝转入成功
     */
    public static final String GENERATE_IN_SUCCESS = "generate_in_success";
    /**
     * 生利宝转出成功
     */
    public static final String GENERATE_OUT_SUCCESS = "generate_out_success";

    /***************************现金贷增加类型****************************/
    /**
     * 到期自动还款成功
     */
    public static final String PAYDAYLOAN_AUTO_REPAY = "paydayloan_auto_repay";
    /**
     * 一次性还款成功
     */
    public static final String PAYDAYLOAN_ONE_REPAY = "paydayloan_one_repay";
    /**
     * 放款成功
     */
    public static final String PAYDAYLOAN_LOAN = "paydayloan_loan";
    /**
     * 扣综合服务费成功
     */
    public static final String PAYDAYLOAN_FEE = "paydayloan_fee";


    /*********************** 用户资金日志类型：对应表sys_log_template code值 end ****************************************/

    /*********************** 通用信息 start ****************************************/
    /**
     * 回调订单处理成功
     **/
    public static final String TPP_ORDER_HANDLE_SUCCESS = "success";

    /**
     * 登录验证码-用户登录错误次数
     **/
    public static final int USER_LOGIN_SHOW_CAPTCHA_TIMES = 3;
    /*********************** 通用信息 end ****************************************/

    /*****************账户锁定类型 start***********************/
    /**
     * 0-登录失败锁定
     **/
    public static final String LOCK_TYPE_LOGIN_FAIL = "0";
    /**
     * 1-后台手动锁定
     **/
    public static final String LOCK_TYPE_MAN_HANDLE = "1";
    /*****************锁定类型 end***********************/
    /**
     * -1-红包加息投资最大值
     **/
    public static final String TENDER_MAX_VALUE = "-1";
    /**
     * 授权缓存key
     */
    public static final String CACHE_STRING = "com.xinzhentech.ifaes.manage.security.SystemAuthorizingRealm.authorizationCache";
    /****************** 积分商城 start ***********************/
    /**
     * 商品图片类型  缩略图-1
     **/
    public static final String GOODS_PIC_TYPE_SMALL = "1";
    /**
     * 商品图片类型  实体图-2
     **/
    public static final String GOODS_PIC_TYPE_BIG = "2";
    /**
     * 商品状态 待审核-0
     */
    public static final String GOODS_STATUS_VERIFY_WAIT = "0";
    /**
     * 商品状态 审核成功-1
     */
    public static final String GOODS_STATUS_VERIFY_SUCCESS = "1";
    /**
     * 商品状态 审核失败-2
     */
    public static final String GOODS_STATUS_VERIFY_FAILD = "2";
    /**
     * 商品状态 已上架-3
     */
    public static final String GOODS_STATUS_SALE_ON = "3";
    /**
     * 商品状态 已下架-4
     */
    public static final String GOODS_STATUS_SALE_STOP = "4";
    /**
     * 订单状态 待审核-0
     */
    public static final String GOODS_ORDER_STATUS_WAIT = "0";
    /**
     * 订单状态 审核通过-1
     */
    public static final String GOODS_ORDER_STATUS_VERIFY_SUCCESS = "1";
    /**
     * 订单状态 审核失败-2
     */
    public static final String GOODS_ORDER_STATUS_VERIFY_FAILD = "2";
    /**
     * 订单状态 已发货-3
     */
    public static final String GOODS_ORDER_STATUS_SEND = "3";
    /**
     * 订单状态 已收货-4
     */
    public static final String GOODS_ORDER_STATUS_RECEIVE = "4";

    /****************** 积分商城 end ***********************/

    /****************** 信息披露-基本信息 20170905 begin ***********************/
    /**
     * 经营状态-工商信息 1 开业；
     */
    public static final String INFO_DISC_BUSINESS_STATUS_OPEN = "1";
    /**
     * 经营状态-工商信息 2 停业；
     */
    public static final String INFO_DISC_BUSINESS_STATUS_STOP = "2";
    /**
     * 经营状态-工商信息 3 注销；
     */
    public static final String INFO_DISC_BUSINESS_STATUS_CANCEL = "3";
    /**
     * 经营状态-工商信息 4 吊销
     */
    public static final String INFO_DISC_BUSINESS_STATUS_WITHDRAW = "4";
    /**
     * 发布状态：1=待发布(提交未发布)
     */
    public static final String RELEASE_STATUS_NOT = "1";
    /**
     * 发布状态：2=已发布
     */
    public static final String RELEASE_STATUS_YET = "2";
    /**
     * 发布状态：3=失效
     */
    public static final String RELEASE_STATUS_LOSE_EFFICACY = "3";
    /**
     * 主要人员类型 1:法定代表人;
     */
    public static final String USER_TYPE_LEGAL_PERSON = "1";
    /**
     * 主要人员类型 2:实际控制人;
     */
    public static final String USER_TYPE_ACTUAL_CONTROLLER = "2";
    /**
     * 主要人员类型 3:董事;
     */
    public static final String USER_TYPE_DIRECTOR = "3";
    /**
     * 主要人员类型 4:监事;
     */
    public static final String USER_TYPE_SUPERVISOR = "4";
    /**
     * 主要人员类型  5:高级管理人员;
     */
    public static final String USER_TYPE_SENIOR_EXECUTIVES = "5";
    /**
     * 关联人类型 1:企业;
     */
    public static final String RELATED_USER_TYPE_COMPANY = "1";
    /**
     * 关联人类型 2:个人;
     */
    public static final String RELATED_USER_TYPE_PERSON = "2";
    /**
     * 关联人证件类型 1:统一社会信用代码;
     */
    public static final String RELATED_CERT_TYPE_CREDIT_CODE = "1";
    /**
     * 关联人证件类型 2:身份证;
     */
    public static final String RELATED_CERT_TYPE_IDNO = "2";
    /**
     * 股东类型 1:控股;
     */
    public static final String SHAREHOLDER_TYPE_HOLDING = "1";
    /**
     * 股东类型 2:参股;
     */
    public static final String SHAREHOLDER_TYPE_SHARE = "2";
    /****************** 信息披露-基本信息 20170905 end ***********************/

    /**
     * 状态 -充值短信申请中
     **/
    public static final String RECHARGE_STATUS_MOBILECODE = "-2";
    /**
     * 状态 -充值短信发送成功
     **/
    public static final String RECHARGE_STATUS_MOBILECODE_SUCCESS = "-1";
    /** 状态 -充值申请中**/


    /************************企业线下充值*******************************/
    //auditStatus;//审核状态:1=待审核,2=审核被拒,3=审核通过,4=作废
    public static final String RECHARGE_OFFLINE_PEND = "1";
    public static final String RECHARGE_OFFLINE_REFUSE = "2";
    public static final String RECHARGE_OFFLINE_PASS = "3";
    public static final String RECHARGE_OFFLINE_CANCEL = "4";
    /*******************************************************************/


    /***********************payService商户号**********************************/
    // 使用通联的商户号
    public static final String ALLINPAY_MERCHANT_ID = "";
    //通联会员号
    public static final String TONG_HUA_ACCOUND_NO = "tongL";
    // 使用九江银行的商户号
    public static final String JJ_MERCHANT_ID = "jiuJDZ";
   //config配置文件配置的商户号名称
    public static final String MERCHANT_ID = "merchantId";
    /******************************************************************/

    /*********************** 九江电子账户内部户 **********************************/
    // 放款内部户config标识
    public static final String P2P_ELECTRONIC_ACCOUNT_LOAN = "P2P_ELECTRONIC_ACCOUNT_LOAN";
    // 还款内部户config标识
    public static final String P2P_ELECTRONIC_ACCOUNT_REPAYMENT = "P2P_ELECTRONIC_ACCOUNT_REPAYMENT";
    // 费用内部户config标识
    public static final String P2P_ELECTRONIC_ACCOUNT_FEE = "P2P_ELECTRONIC_ACCOUNT_FEE";
    // 交易所投融资平台代付户
    public static final String EXCHANGE_ELECTRONIC_ACCOUNT_PAID = "EXCHANGE_ELECTRONIC_ACCOUNT_PAID";
    // 交易所营销支出费用内部户
    public static final String EXCHANGE_ELECTRONIC_ACCOUNT_FEE = "EXCHANGE_ELECTRONIC_ACCOUNT_FEE";
    // 货币基金投融资平台代付户
    public static final String MONEY_FUND_ACCOUNT_PAID = "MONEY_FUND_ACCOUNT_PAID";
    /******************************************************************/

    /*********************** 九江申购赎回 **********************************/
    //
    public  static final String INST_ID = "78470000";
    //交易类型：赎回
    public  static final String PROCESSING_CODE_RANSOM = "2290";
    //交易类型：查询
    public  static final String PROCESSING_CODE_QUERY = "3001";
    //交易类型：开户
    public static final String PROCESSING_CODE_CREATE_ACCOUNT = "1087";
    //交易类型：申购
    public static final String PROCESSING_CODE_PURCHASE = "2085";
    //交易类型标识：1=申购,2=赎回,3=收益
    public static final int INVEST_TYPE_PURCHASE= 1;
    public static final int INVEST_TYPE_RANSOM = 2;
    public static final int INVEST_TYPE_INTEREST = 3;
    //交易状态：0=待确认,1=成功,2=失败
    public static final int UNCONFIRMED_STATUS = 0;
    public static final int SUCCESS_STATUS = 1;
    public static final int FAILURE_STATUS = 2;
    //产品引入方：0.机构引入(当前采用)；1.通联引入
    public static final String PROD_IMPORT_FLAG_ORGANIZATION = "0";
    public static final String PROD_IMPORT_FLAG_TONGLIAN = "1";
    //基金购买类型
    public static final String MONEY_FUND_PURCHASE_TYPE = "2";
    //第三方类型名称--通联会员号
    public static final String USER_TPP_TYPE_NAME = "通联会员号";
    //九江账号前缀规则
    public static final String ACCT_NUM_PRE = "123455";
    //账户类型：1.借记卡；2.贷记卡；3.准贷记卡；4.预付费卡；目前填写1 ,
    public static final String ACCT_TYPE_DEBIT = "1";
    //是否垫资
    public static final String ADVANCE_FLAG_TRUE = "1";
    //证件类型
    public static final String CER_TYPE = "01";
    //签约类型：1.网页；2.快捷；3.信任；4.供应商开户
    public static final String SIGN_TYPE = "3";
    //版本号
    public static final String VER_NUM = "1.00";
    //账户标识
    public static final String CHARGE_FLAG = "1";
    public static final String CUR_TYPE_RMB = "156";
    public static final String PAY_CODE_BANK = "0";
    public static final String PRODUCT_CODE_CASH_ACCT = "000709";

    public static final String FUND_PROJECT_SUCCESS = "SUCCESS";
    public static final String FUND_PROJECT_FAIL = "FAIL";
    public static final String FUND_PROJECT_PROCESSING = "PROCESSING";

    // 基金开户状态
    public static final String FUND_CREATE_ACCOUNT_SUCCESS = "1";
    public static final String FUND_CREATE_ACCOUNT_FAIL = "0";

    //电子转账和冲正状态：0=成功，1=失败，5=处理中
    public static final int FUND_TRANSFER_SUCCESS = 0;
    public static final int FUND_TRANSFER_FAILURE = 1;
    public static final int FUND_TRANSFER_UNCONFIRMED = 5;

    //支付模式：4=机构自付
    public static final String MONEY_FUND_PAY_MODE = "4";

    //货基资金操作类型
    public static final String PURCHASE_ACCOUNT_TYPE = "money_fund_purchase";
    public static final String PURCHASE_FAILURE_ACCOUNT_TYPE = "money_fund_purchase_failure";

    //供应商标识
    public static final String MONEY_FUND_PROD_FLAG = "2";
    //供应商编码
    public static final String MONEY_FUND_SUPPLY_INST_CODE = "000000324";

    /******************************************************************/
    /*********************** 内置产品类别频道 **********************************/
    // 交易所频道
    public static final String EXCHANGE_TYPE = "exchange";
    // P2P频道
    public static final String P2P_TYPE = "p2p";
    /******************************************************************/

    //九江银行编码
    public static final String BOJ_BANKCODE="04544240";

    /**
     * 公共变量
     */
    private Constant() {

    }

    /**************************************************************************/
    /**
     * 数据是否删除标识
     */
    public static final int NOT_DELETE_FLAG = 0; /**未删除***/
    public static final int DELETE_FLAG = 1; /**删除***/
}
