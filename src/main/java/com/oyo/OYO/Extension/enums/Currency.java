package com.oyo.OYO.Extension.enums;

public enum Currency {
    /*
     * NOTE: Here multiplicationFactor is as per Adyen document -
     * https://docs.adyen.com/development-resources/currency-codes
     */
    INR(0, "INR", 100, 100),
    NPR(1, "NPR", 100, 100),
    CNY(2, "CNY", 100, 100),
    MYR(3, "MYR", 100, 100),
    IDR(4, "IDR", 1, 100),
    AED(5, "AED", 100, 100),
    PHP(6, "PHP", 100, 100),
    VND(7, "VND", 1, 1),
    SAR(8, "SAR", 100, 100),
    GBP(9, "GBP", 100, 100),
    JPY(10, "JPY", 1, 1),
    LKR(11, "LKR", 100, 100),
    AFN(12, "AFN", 1000, 1000), // Not in Adyen
    EUR(13, "EUR", 100, 100),
    ALL(14, "ALL", 100, 100),
    DZD(15, "DZD", 100, 100),
    USD(16, "USD", 100, 100),
    AOA(17, "AOA", 100, 100),
    XCD(18, "XCD", 100, 100),
    ARS(19, "ARS", 100, 100),
    AMD(20, "AMD", 100, 100),
    AWG(21, "AWG", 100, 100),
    AUD(22, "AUD", 100, 100),
    AZN(23, "AZN", 100, 100),
    BSD(24, "BSD", 100, 100),
    BHD(25, "BHD", 1000, 1000),
    BDT(26, "BDT", 100, 100),
    BBD(27, "BBD", 100, 100),
    BYN(28, "BYN", 100, 100),
    BZD(29, "BZD", 100, 100),
    XOF(30, "XOF", 1, 1),
    BMD(31, "BMD", 100, 100),
    BTN(32, "BTN", 1000, 1000), // Not in Adyen
    BOB(33, "BOB", 100, 100),
    BOV(34, "BOV", 1000, 1000), // Not in Adyen
    BAM(35, "BAM", 100, 100),
    BWP(36, "BWP", 100, 100),
    NOK(37, "NOK", 100, 100),
    BRL(38, "BRL", 100, 100),
    BND(39, "BND", 100, 100),
    BGN(40, "BGN", 100, 100),
    BIF(41, "BIF", 1000, 1000), // Not in Adyen
    CVE(42, "CVE", 1, 1),
    KHR(43, "KHR", 100, 100),
    XAF(44, "XAF", 1, 1),
    CAD(45, "CAD", 100, 100),
    KYD(46, "KYD", 100, 100),
    CLP(47, "CLP", 100, 100),
    CLF(48, "CLF", 1000, 1000), // Not in Adyen
    COP(49, "COP", 100, 100),
    COU(50, "COU", 1000, 1000), // Not in Adyen
    KMF(51, "KMF", 1, 1),
    CDF(52, "CDF", 1000, 1000), // Not in Adyen
    NZD(53, "NZD", 100, 100),
    CRC(54, "CRC", 100, 100),
    HRK(55, "HRK", 100, 100),
    CUP(56, "CUP", 100, 100),
    CUC(57, "CUC", 1000, 1000), // Not in Adyen
    ANG(58, "ANG", 100, 100),
    CZK(59, "CZK", 100, 100),
    DKK(60, "DKK", 100, 100),
    DJF(61, "DJF", 1, 1),
    DOP(62, "DOP", 100, 100),
    EGP(63, "EGP", 100, 100),
    SVC(64, "SVC", 100, 100),
    ERN(65, "ERN", 1000, 1000), // Not in Adyen
    ETB(66, "ETB", 100, 100),
    FKP(67, "FKP", 100, 100),
    FJD(68, "FJD", 100, 100),
    XPF(69, "XPF", 1, 1),
    GMD(70, "GMD", 100, 100),
    GEL(71, "GEL", 100, 100),
    GHS(72, "GHS", 100, 100),
    GIP(73, "GIP", 100, 100),
    GTQ(74, "GTQ", 100, 100),
    GNF(75, "GNF", 1, 1),
    GYD(76, "GYD", 100, 100),
    HTG(77, "HTG", 100, 100),
    HNL(78, "HNL", 100, 100),
    HKD(79, "HKD", 100, 100),
    HUF(80, "HUF", 100, 100),
    ISK(81, "ISK", 100, 100),
    XDR(82, "XDR", 1000, 1000), // Not in Adyen
    IRR(83, "IRR", 1000, 1000), // Not in Adyen
    IQD(84, "IQD", 1000, 1000),
    ILS(85, "ILS", 100, 100),
    JMD(86, "JMD", 100, 100),
    JOD(87, "JOD", 1000, 1000),
    KZT(88, "KZT", 100, 100),
    KES(89, "KES", 100, 100),
    KPW(90, "KPW", 1000, 1000), // Not in Adyen
    KRW(91, "KRW", 1, 1),
    KWD(92, "KWD", 1000, 1000),
    KGS(93, "KGS", 100, 100),
    LAK(94, "LAK", 100, 100),
    LBP(95, "LBP", 100, 100),
    LSL(96, "LSL", 1000, 1000), // Not in Adyen
    ZAR(97, "ZAR", 100, 100),
    LRD(98, "LRD", 1000, 1000), // Not in Adyen
    LYD(99, "LYD", 1000, 1000),
    CHF(100, "CHF", 100, 100),
    MOP(101, "MOP", 100, 100),
    MKD(102, "MKD", 100, 100),
    MGA(103, "MGA", 1000, 1000), // Not in Adyen
    MWK(104, "MWK", 100, 100),
    MVR(105, "MVR", 100, 100),
    MRU(106, "MRU", 100, 100),
    MUR(107, "MUR", 100, 100),
    XUA(108, "XUA", 1000, 1000), // Not in Adyen
    MXN(109, "MXN", 100, 100),
    MXV(110, "MXV", 1000, 1000), // Not in Adyen
    MDL(111, "MDL", 100, 100),
    MNT(112, "MNT", 100, 100),
    MAD(113, "MAD", 100, 100),
    MZN(114, "MZN", 100, 100),
    MMK(115, "MMK", 100, 100),
    NAD(116, "NAD", 100, 100),
    NIO(117, "NIO", 100, 100),
    NGN(118, "NGN", 100, 100),
    OMR(119, "OMR", 1000, 1000),
    PKR(120, "PKR", 100, 100),
    PGK(121, "PGK", 100, 100),
    PYG(122, "PYG", 1, 1),
    PEN(123, "PEN", 100, 100),
    PLN(124, "PLN", 100, 100),
    QAR(125, "QAR", 100, 100),
    RON(126, "RON", 100, 100),
    RUB(127, "RUB", 100, 100),
    RWF(128, "RWF", 1, 1),
    SHP(129, "SHP", 100, 100),
    WST(130, "WST", 100, 100),
    STN(131, "STN", 100, 100),
    RSD(132, "RSD", 100, 100),
    SCR(133, "SCR", 100, 100),
    SLL(134, "SLL", 100, 100),
    SGD(135, "SGD", 100, 100),
    XSU(136, "XSU", 1000, 1000), // Not in Adyen
    SBD(137, "SBD", 100, 100),
    SOS(138, "SOS", 100, 100),
    SDG(139, "SDG", 1000, 1000), // Not in Adyen
    SRD(140, "SRD", 100, 100),
    SZL(141, "SZL", 100, 100),
    SEK(142, "SEK", 100, 100),
    CHE(143, "CHE", 1000, 1000), // Not in Adyen
    CHW(144, "CHW", 1000, 1000), // Not in Adyen
    SYP(145, "SYP", 1000, 1000), // Not in Adyen
    TWD(146, "TWD", 100, 100),
    TJS(147, "TJS", 1000, 1000), // Not in Adyen
    TZS(148, "TZS", 100, 100),
    THB(149, "THB", 100, 100),
    TOP(150, "TOP", 100, 100),
    TTD(151, "TTD", 100, 100),
    TND(152, "TND", 1000, 1000),
    TRY(153, "TRY", 100, 100),
    TMT(154, "TMT", 1000, 1000), // Not in Adyen
    UGX(155, "UGX", 1, 1),
    UAH(156, "UAH", 100, 100),
    USN(157, "USN", 1000, 1000), // Not in Adyen
    UYU(158, "UYU", 100, 100),
    UYI(159, "UYI", 1000, 1000), // Not in Adyen
    UYW(160, "UYW", 1000, 1000), // Not in Adyen
    UZS(161, "UZS", 100, 100),
    VUV(162, "VUV", 1, 1),
    VES(163, "VES", 1000, 1000), // Not in Adyen
    YER(164, "YER", 100, 100),
    ZMW(165, "ZMW", 100, 100),
    ZWL(166, "ZWL", 1000, 1000), // Not in Adyen
    XBA(167, "XBA", 1000, 1000), // Not in Adyen
    XBB(168, "XBB", 1000, 1000), // Not in Adyen
    XBC(169, "XBC", 1000, 1000), // Not in Adyen
    XBD(170, "XBD", 1000, 1000), // Not in Adyen
    XTS(171, "XTS", 1000, 1000), // Not in Adyen
    XXX(172, "XXX", 1000, 1000), // Not in Adyen
    XAU(173, "XAU", 1000, 1000), // Not in Adyen
    XPD(174, "XPD", 1000, 1000), // Not in Adyen
    XPT(175, "XPT", 1000, 1000), // Not in Adyen
    CSD(176, "CSD", 100, 100),
    EEK(177, "EEK", 100, 100),
    LTL(178, "LTL", 100, 100),
    LVL(179, "LVL", 100, 100),
    PAB(180, "PAB", 100, 100),
    SKK(181, "SKK", 100, 100),
    VEF(182, "VEF", 100, 100);
    private int id;
    private String currency;
    private int multiplicationFactor;
    private int grabMultiplicationFactor;
    Currency() {}
    Currency(int id, String currency, int multiplicationFactor, int grabMultiplicationFactor) {
        this.id = id;
        this.currency = currency;
        this.multiplicationFactor = multiplicationFactor;
        this.grabMultiplicationFactor = grabMultiplicationFactor;
    }
    public static Currency fromString(String currency) {
        return Currency.valueOf(currency);
    }
    public int getId() {
        return id;
    }
    public String getValue() {
        return currency;
    }
    public int getMultiplicationFactor() {
        return multiplicationFactor;
    }
    public int getGrabMultiplicationFactor() {
        return grabMultiplicationFactor;
    }
    public static Currency parse(int id) {
        Currency result = null;
        for (Currency currency : Currency.values()) {
            if (currency.getId() == id) {
                return currency;
            }
        }
        return result;
    }
}
