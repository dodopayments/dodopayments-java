// File generated from our OpenAPI spec by Stainless.

package com.dodo_payments.api.models.misc

import com.dodo_payments.api.core.Enum
import com.dodo_payments.api.core.JsonField
import com.dodo_payments.api.errors.DodoPaymentsInvalidDataException
import com.fasterxml.jackson.annotation.JsonCreator

/** ISO country code alpha2 variant */
class CountryCode @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val AF = of("AF")

        @JvmField val AX = of("AX")

        @JvmField val AL = of("AL")

        @JvmField val DZ = of("DZ")

        @JvmField val AS = of("AS")

        @JvmField val AD = of("AD")

        @JvmField val AO = of("AO")

        @JvmField val AI = of("AI")

        @JvmField val AQ = of("AQ")

        @JvmField val AG = of("AG")

        @JvmField val AR = of("AR")

        @JvmField val AM = of("AM")

        @JvmField val AW = of("AW")

        @JvmField val AU = of("AU")

        @JvmField val AT = of("AT")

        @JvmField val AZ = of("AZ")

        @JvmField val BS = of("BS")

        @JvmField val BH = of("BH")

        @JvmField val BD = of("BD")

        @JvmField val BB = of("BB")

        @JvmField val BY = of("BY")

        @JvmField val BE = of("BE")

        @JvmField val BZ = of("BZ")

        @JvmField val BJ = of("BJ")

        @JvmField val BM = of("BM")

        @JvmField val BT = of("BT")

        @JvmField val BO = of("BO")

        @JvmField val BQ = of("BQ")

        @JvmField val BA = of("BA")

        @JvmField val BW = of("BW")

        @JvmField val BV = of("BV")

        @JvmField val BR = of("BR")

        @JvmField val IO = of("IO")

        @JvmField val BN = of("BN")

        @JvmField val BG = of("BG")

        @JvmField val BF = of("BF")

        @JvmField val BI = of("BI")

        @JvmField val KH = of("KH")

        @JvmField val CM = of("CM")

        @JvmField val CA = of("CA")

        @JvmField val CV = of("CV")

        @JvmField val KY = of("KY")

        @JvmField val CF = of("CF")

        @JvmField val TD = of("TD")

        @JvmField val CL = of("CL")

        @JvmField val CN = of("CN")

        @JvmField val CX = of("CX")

        @JvmField val CC = of("CC")

        @JvmField val CO = of("CO")

        @JvmField val KM = of("KM")

        @JvmField val CG = of("CG")

        @JvmField val CD = of("CD")

        @JvmField val CK = of("CK")

        @JvmField val CR = of("CR")

        @JvmField val CI = of("CI")

        @JvmField val HR = of("HR")

        @JvmField val CU = of("CU")

        @JvmField val CW = of("CW")

        @JvmField val CY = of("CY")

        @JvmField val CZ = of("CZ")

        @JvmField val DK = of("DK")

        @JvmField val DJ = of("DJ")

        @JvmField val DM = of("DM")

        @JvmField val DO = of("DO")

        @JvmField val EC = of("EC")

        @JvmField val EG = of("EG")

        @JvmField val SV = of("SV")

        @JvmField val GQ = of("GQ")

        @JvmField val ER = of("ER")

        @JvmField val EE = of("EE")

        @JvmField val ET = of("ET")

        @JvmField val FK = of("FK")

        @JvmField val FO = of("FO")

        @JvmField val FJ = of("FJ")

        @JvmField val FI = of("FI")

        @JvmField val FR = of("FR")

        @JvmField val GF = of("GF")

        @JvmField val PF = of("PF")

        @JvmField val TF = of("TF")

        @JvmField val GA = of("GA")

        @JvmField val GM = of("GM")

        @JvmField val GE = of("GE")

        @JvmField val DE = of("DE")

        @JvmField val GH = of("GH")

        @JvmField val GI = of("GI")

        @JvmField val GR = of("GR")

        @JvmField val GL = of("GL")

        @JvmField val GD = of("GD")

        @JvmField val GP = of("GP")

        @JvmField val GU = of("GU")

        @JvmField val GT = of("GT")

        @JvmField val GG = of("GG")

        @JvmField val GN = of("GN")

        @JvmField val GW = of("GW")

        @JvmField val GY = of("GY")

        @JvmField val HT = of("HT")

        @JvmField val HM = of("HM")

        @JvmField val VA = of("VA")

        @JvmField val HN = of("HN")

        @JvmField val HK = of("HK")

        @JvmField val HU = of("HU")

        @JvmField val IS = of("IS")

        @JvmField val IN = of("IN")

        @JvmField val ID = of("ID")

        @JvmField val IR = of("IR")

        @JvmField val IQ = of("IQ")

        @JvmField val IE = of("IE")

        @JvmField val IM = of("IM")

        @JvmField val IL = of("IL")

        @JvmField val IT = of("IT")

        @JvmField val JM = of("JM")

        @JvmField val JP = of("JP")

        @JvmField val JE = of("JE")

        @JvmField val JO = of("JO")

        @JvmField val KZ = of("KZ")

        @JvmField val KE = of("KE")

        @JvmField val KI = of("KI")

        @JvmField val KP = of("KP")

        @JvmField val KR = of("KR")

        @JvmField val KW = of("KW")

        @JvmField val KG = of("KG")

        @JvmField val LA = of("LA")

        @JvmField val LV = of("LV")

        @JvmField val LB = of("LB")

        @JvmField val LS = of("LS")

        @JvmField val LR = of("LR")

        @JvmField val LY = of("LY")

        @JvmField val LI = of("LI")

        @JvmField val LT = of("LT")

        @JvmField val LU = of("LU")

        @JvmField val MO = of("MO")

        @JvmField val MK = of("MK")

        @JvmField val MG = of("MG")

        @JvmField val MW = of("MW")

        @JvmField val MY = of("MY")

        @JvmField val MV = of("MV")

        @JvmField val ML = of("ML")

        @JvmField val MT = of("MT")

        @JvmField val MH = of("MH")

        @JvmField val MQ = of("MQ")

        @JvmField val MR = of("MR")

        @JvmField val MU = of("MU")

        @JvmField val YT = of("YT")

        @JvmField val MX = of("MX")

        @JvmField val FM = of("FM")

        @JvmField val MD = of("MD")

        @JvmField val MC = of("MC")

        @JvmField val MN = of("MN")

        @JvmField val ME = of("ME")

        @JvmField val MS = of("MS")

        @JvmField val MA = of("MA")

        @JvmField val MZ = of("MZ")

        @JvmField val MM = of("MM")

        @JvmField val NA = of("NA")

        @JvmField val NR = of("NR")

        @JvmField val NP = of("NP")

        @JvmField val NL = of("NL")

        @JvmField val NC = of("NC")

        @JvmField val NZ = of("NZ")

        @JvmField val NI = of("NI")

        @JvmField val NE = of("NE")

        @JvmField val NG = of("NG")

        @JvmField val NU = of("NU")

        @JvmField val NF = of("NF")

        @JvmField val MP = of("MP")

        @JvmField val NO = of("NO")

        @JvmField val OM = of("OM")

        @JvmField val PK = of("PK")

        @JvmField val PW = of("PW")

        @JvmField val PS = of("PS")

        @JvmField val PA = of("PA")

        @JvmField val PG = of("PG")

        @JvmField val PY = of("PY")

        @JvmField val PE = of("PE")

        @JvmField val PH = of("PH")

        @JvmField val PN = of("PN")

        @JvmField val PL = of("PL")

        @JvmField val PT = of("PT")

        @JvmField val PR = of("PR")

        @JvmField val QA = of("QA")

        @JvmField val RE = of("RE")

        @JvmField val RO = of("RO")

        @JvmField val RU = of("RU")

        @JvmField val RW = of("RW")

        @JvmField val BL = of("BL")

        @JvmField val SH = of("SH")

        @JvmField val KN = of("KN")

        @JvmField val LC = of("LC")

        @JvmField val MF = of("MF")

        @JvmField val PM = of("PM")

        @JvmField val VC = of("VC")

        @JvmField val WS = of("WS")

        @JvmField val SM = of("SM")

        @JvmField val ST = of("ST")

        @JvmField val SA = of("SA")

        @JvmField val SN = of("SN")

        @JvmField val RS = of("RS")

        @JvmField val SC = of("SC")

        @JvmField val SL = of("SL")

        @JvmField val SG = of("SG")

        @JvmField val SX = of("SX")

        @JvmField val SK = of("SK")

        @JvmField val SI = of("SI")

        @JvmField val SB = of("SB")

        @JvmField val SO = of("SO")

        @JvmField val ZA = of("ZA")

        @JvmField val GS = of("GS")

        @JvmField val SS = of("SS")

        @JvmField val ES = of("ES")

        @JvmField val LK = of("LK")

        @JvmField val SD = of("SD")

        @JvmField val SR = of("SR")

        @JvmField val SJ = of("SJ")

        @JvmField val SZ = of("SZ")

        @JvmField val SE = of("SE")

        @JvmField val CH = of("CH")

        @JvmField val SY = of("SY")

        @JvmField val TW = of("TW")

        @JvmField val TJ = of("TJ")

        @JvmField val TZ = of("TZ")

        @JvmField val TH = of("TH")

        @JvmField val TL = of("TL")

        @JvmField val TG = of("TG")

        @JvmField val TK = of("TK")

        @JvmField val TO = of("TO")

        @JvmField val TT = of("TT")

        @JvmField val TN = of("TN")

        @JvmField val TR = of("TR")

        @JvmField val TM = of("TM")

        @JvmField val TC = of("TC")

        @JvmField val TV = of("TV")

        @JvmField val UG = of("UG")

        @JvmField val UA = of("UA")

        @JvmField val AE = of("AE")

        @JvmField val GB = of("GB")

        @JvmField val UM = of("UM")

        @JvmField val US = of("US")

        @JvmField val UY = of("UY")

        @JvmField val UZ = of("UZ")

        @JvmField val VU = of("VU")

        @JvmField val VE = of("VE")

        @JvmField val VN = of("VN")

        @JvmField val VG = of("VG")

        @JvmField val VI = of("VI")

        @JvmField val WF = of("WF")

        @JvmField val EH = of("EH")

        @JvmField val YE = of("YE")

        @JvmField val ZM = of("ZM")

        @JvmField val ZW = of("ZW")

        @JvmStatic fun of(value: String) = CountryCode(JsonField.of(value))
    }

    /** An enum containing [CountryCode]'s known values. */
    enum class Known {
        AF,
        AX,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BQ,
        BA,
        BW,
        BV,
        BR,
        IO,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CG,
        CD,
        CK,
        CR,
        CI,
        HR,
        CU,
        CW,
        CY,
        CZ,
        DK,
        DJ,
        DM,
        DO,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        GF,
        PF,
        TF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GP,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HM,
        VA,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KP,
        KR,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MQ,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        NF,
        MP,
        NO,
        OM,
        PK,
        PW,
        PS,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        GS,
        SS,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TL,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        UG,
        UA,
        AE,
        GB,
        UM,
        US,
        UY,
        UZ,
        VU,
        VE,
        VN,
        VG,
        VI,
        WF,
        EH,
        YE,
        ZM,
        ZW,
    }

    /**
     * An enum containing [CountryCode]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [CountryCode] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        AF,
        AX,
        AL,
        DZ,
        AS,
        AD,
        AO,
        AI,
        AQ,
        AG,
        AR,
        AM,
        AW,
        AU,
        AT,
        AZ,
        BS,
        BH,
        BD,
        BB,
        BY,
        BE,
        BZ,
        BJ,
        BM,
        BT,
        BO,
        BQ,
        BA,
        BW,
        BV,
        BR,
        IO,
        BN,
        BG,
        BF,
        BI,
        KH,
        CM,
        CA,
        CV,
        KY,
        CF,
        TD,
        CL,
        CN,
        CX,
        CC,
        CO,
        KM,
        CG,
        CD,
        CK,
        CR,
        CI,
        HR,
        CU,
        CW,
        CY,
        CZ,
        DK,
        DJ,
        DM,
        DO,
        EC,
        EG,
        SV,
        GQ,
        ER,
        EE,
        ET,
        FK,
        FO,
        FJ,
        FI,
        FR,
        GF,
        PF,
        TF,
        GA,
        GM,
        GE,
        DE,
        GH,
        GI,
        GR,
        GL,
        GD,
        GP,
        GU,
        GT,
        GG,
        GN,
        GW,
        GY,
        HT,
        HM,
        VA,
        HN,
        HK,
        HU,
        IS,
        IN,
        ID,
        IR,
        IQ,
        IE,
        IM,
        IL,
        IT,
        JM,
        JP,
        JE,
        JO,
        KZ,
        KE,
        KI,
        KP,
        KR,
        KW,
        KG,
        LA,
        LV,
        LB,
        LS,
        LR,
        LY,
        LI,
        LT,
        LU,
        MO,
        MK,
        MG,
        MW,
        MY,
        MV,
        ML,
        MT,
        MH,
        MQ,
        MR,
        MU,
        YT,
        MX,
        FM,
        MD,
        MC,
        MN,
        ME,
        MS,
        MA,
        MZ,
        MM,
        NA,
        NR,
        NP,
        NL,
        NC,
        NZ,
        NI,
        NE,
        NG,
        NU,
        NF,
        MP,
        NO,
        OM,
        PK,
        PW,
        PS,
        PA,
        PG,
        PY,
        PE,
        PH,
        PN,
        PL,
        PT,
        PR,
        QA,
        RE,
        RO,
        RU,
        RW,
        BL,
        SH,
        KN,
        LC,
        MF,
        PM,
        VC,
        WS,
        SM,
        ST,
        SA,
        SN,
        RS,
        SC,
        SL,
        SG,
        SX,
        SK,
        SI,
        SB,
        SO,
        ZA,
        GS,
        SS,
        ES,
        LK,
        SD,
        SR,
        SJ,
        SZ,
        SE,
        CH,
        SY,
        TW,
        TJ,
        TZ,
        TH,
        TL,
        TG,
        TK,
        TO,
        TT,
        TN,
        TR,
        TM,
        TC,
        TV,
        UG,
        UA,
        AE,
        GB,
        UM,
        US,
        UY,
        UZ,
        VU,
        VE,
        VN,
        VG,
        VI,
        WF,
        EH,
        YE,
        ZM,
        ZW,
        /** An enum member indicating that [CountryCode] was instantiated with an unknown value. */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            AF -> Value.AF
            AX -> Value.AX
            AL -> Value.AL
            DZ -> Value.DZ
            AS -> Value.AS
            AD -> Value.AD
            AO -> Value.AO
            AI -> Value.AI
            AQ -> Value.AQ
            AG -> Value.AG
            AR -> Value.AR
            AM -> Value.AM
            AW -> Value.AW
            AU -> Value.AU
            AT -> Value.AT
            AZ -> Value.AZ
            BS -> Value.BS
            BH -> Value.BH
            BD -> Value.BD
            BB -> Value.BB
            BY -> Value.BY
            BE -> Value.BE
            BZ -> Value.BZ
            BJ -> Value.BJ
            BM -> Value.BM
            BT -> Value.BT
            BO -> Value.BO
            BQ -> Value.BQ
            BA -> Value.BA
            BW -> Value.BW
            BV -> Value.BV
            BR -> Value.BR
            IO -> Value.IO
            BN -> Value.BN
            BG -> Value.BG
            BF -> Value.BF
            BI -> Value.BI
            KH -> Value.KH
            CM -> Value.CM
            CA -> Value.CA
            CV -> Value.CV
            KY -> Value.KY
            CF -> Value.CF
            TD -> Value.TD
            CL -> Value.CL
            CN -> Value.CN
            CX -> Value.CX
            CC -> Value.CC
            CO -> Value.CO
            KM -> Value.KM
            CG -> Value.CG
            CD -> Value.CD
            CK -> Value.CK
            CR -> Value.CR
            CI -> Value.CI
            HR -> Value.HR
            CU -> Value.CU
            CW -> Value.CW
            CY -> Value.CY
            CZ -> Value.CZ
            DK -> Value.DK
            DJ -> Value.DJ
            DM -> Value.DM
            DO -> Value.DO
            EC -> Value.EC
            EG -> Value.EG
            SV -> Value.SV
            GQ -> Value.GQ
            ER -> Value.ER
            EE -> Value.EE
            ET -> Value.ET
            FK -> Value.FK
            FO -> Value.FO
            FJ -> Value.FJ
            FI -> Value.FI
            FR -> Value.FR
            GF -> Value.GF
            PF -> Value.PF
            TF -> Value.TF
            GA -> Value.GA
            GM -> Value.GM
            GE -> Value.GE
            DE -> Value.DE
            GH -> Value.GH
            GI -> Value.GI
            GR -> Value.GR
            GL -> Value.GL
            GD -> Value.GD
            GP -> Value.GP
            GU -> Value.GU
            GT -> Value.GT
            GG -> Value.GG
            GN -> Value.GN
            GW -> Value.GW
            GY -> Value.GY
            HT -> Value.HT
            HM -> Value.HM
            VA -> Value.VA
            HN -> Value.HN
            HK -> Value.HK
            HU -> Value.HU
            IS -> Value.IS
            IN -> Value.IN
            ID -> Value.ID
            IR -> Value.IR
            IQ -> Value.IQ
            IE -> Value.IE
            IM -> Value.IM
            IL -> Value.IL
            IT -> Value.IT
            JM -> Value.JM
            JP -> Value.JP
            JE -> Value.JE
            JO -> Value.JO
            KZ -> Value.KZ
            KE -> Value.KE
            KI -> Value.KI
            KP -> Value.KP
            KR -> Value.KR
            KW -> Value.KW
            KG -> Value.KG
            LA -> Value.LA
            LV -> Value.LV
            LB -> Value.LB
            LS -> Value.LS
            LR -> Value.LR
            LY -> Value.LY
            LI -> Value.LI
            LT -> Value.LT
            LU -> Value.LU
            MO -> Value.MO
            MK -> Value.MK
            MG -> Value.MG
            MW -> Value.MW
            MY -> Value.MY
            MV -> Value.MV
            ML -> Value.ML
            MT -> Value.MT
            MH -> Value.MH
            MQ -> Value.MQ
            MR -> Value.MR
            MU -> Value.MU
            YT -> Value.YT
            MX -> Value.MX
            FM -> Value.FM
            MD -> Value.MD
            MC -> Value.MC
            MN -> Value.MN
            ME -> Value.ME
            MS -> Value.MS
            MA -> Value.MA
            MZ -> Value.MZ
            MM -> Value.MM
            NA -> Value.NA
            NR -> Value.NR
            NP -> Value.NP
            NL -> Value.NL
            NC -> Value.NC
            NZ -> Value.NZ
            NI -> Value.NI
            NE -> Value.NE
            NG -> Value.NG
            NU -> Value.NU
            NF -> Value.NF
            MP -> Value.MP
            NO -> Value.NO
            OM -> Value.OM
            PK -> Value.PK
            PW -> Value.PW
            PS -> Value.PS
            PA -> Value.PA
            PG -> Value.PG
            PY -> Value.PY
            PE -> Value.PE
            PH -> Value.PH
            PN -> Value.PN
            PL -> Value.PL
            PT -> Value.PT
            PR -> Value.PR
            QA -> Value.QA
            RE -> Value.RE
            RO -> Value.RO
            RU -> Value.RU
            RW -> Value.RW
            BL -> Value.BL
            SH -> Value.SH
            KN -> Value.KN
            LC -> Value.LC
            MF -> Value.MF
            PM -> Value.PM
            VC -> Value.VC
            WS -> Value.WS
            SM -> Value.SM
            ST -> Value.ST
            SA -> Value.SA
            SN -> Value.SN
            RS -> Value.RS
            SC -> Value.SC
            SL -> Value.SL
            SG -> Value.SG
            SX -> Value.SX
            SK -> Value.SK
            SI -> Value.SI
            SB -> Value.SB
            SO -> Value.SO
            ZA -> Value.ZA
            GS -> Value.GS
            SS -> Value.SS
            ES -> Value.ES
            LK -> Value.LK
            SD -> Value.SD
            SR -> Value.SR
            SJ -> Value.SJ
            SZ -> Value.SZ
            SE -> Value.SE
            CH -> Value.CH
            SY -> Value.SY
            TW -> Value.TW
            TJ -> Value.TJ
            TZ -> Value.TZ
            TH -> Value.TH
            TL -> Value.TL
            TG -> Value.TG
            TK -> Value.TK
            TO -> Value.TO
            TT -> Value.TT
            TN -> Value.TN
            TR -> Value.TR
            TM -> Value.TM
            TC -> Value.TC
            TV -> Value.TV
            UG -> Value.UG
            UA -> Value.UA
            AE -> Value.AE
            GB -> Value.GB
            UM -> Value.UM
            US -> Value.US
            UY -> Value.UY
            UZ -> Value.UZ
            VU -> Value.VU
            VE -> Value.VE
            VN -> Value.VN
            VG -> Value.VG
            VI -> Value.VI
            WF -> Value.WF
            EH -> Value.EH
            YE -> Value.YE
            ZM -> Value.ZM
            ZW -> Value.ZW
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value is a not a known
     *   member.
     */
    fun known(): Known =
        when (this) {
            AF -> Known.AF
            AX -> Known.AX
            AL -> Known.AL
            DZ -> Known.DZ
            AS -> Known.AS
            AD -> Known.AD
            AO -> Known.AO
            AI -> Known.AI
            AQ -> Known.AQ
            AG -> Known.AG
            AR -> Known.AR
            AM -> Known.AM
            AW -> Known.AW
            AU -> Known.AU
            AT -> Known.AT
            AZ -> Known.AZ
            BS -> Known.BS
            BH -> Known.BH
            BD -> Known.BD
            BB -> Known.BB
            BY -> Known.BY
            BE -> Known.BE
            BZ -> Known.BZ
            BJ -> Known.BJ
            BM -> Known.BM
            BT -> Known.BT
            BO -> Known.BO
            BQ -> Known.BQ
            BA -> Known.BA
            BW -> Known.BW
            BV -> Known.BV
            BR -> Known.BR
            IO -> Known.IO
            BN -> Known.BN
            BG -> Known.BG
            BF -> Known.BF
            BI -> Known.BI
            KH -> Known.KH
            CM -> Known.CM
            CA -> Known.CA
            CV -> Known.CV
            KY -> Known.KY
            CF -> Known.CF
            TD -> Known.TD
            CL -> Known.CL
            CN -> Known.CN
            CX -> Known.CX
            CC -> Known.CC
            CO -> Known.CO
            KM -> Known.KM
            CG -> Known.CG
            CD -> Known.CD
            CK -> Known.CK
            CR -> Known.CR
            CI -> Known.CI
            HR -> Known.HR
            CU -> Known.CU
            CW -> Known.CW
            CY -> Known.CY
            CZ -> Known.CZ
            DK -> Known.DK
            DJ -> Known.DJ
            DM -> Known.DM
            DO -> Known.DO
            EC -> Known.EC
            EG -> Known.EG
            SV -> Known.SV
            GQ -> Known.GQ
            ER -> Known.ER
            EE -> Known.EE
            ET -> Known.ET
            FK -> Known.FK
            FO -> Known.FO
            FJ -> Known.FJ
            FI -> Known.FI
            FR -> Known.FR
            GF -> Known.GF
            PF -> Known.PF
            TF -> Known.TF
            GA -> Known.GA
            GM -> Known.GM
            GE -> Known.GE
            DE -> Known.DE
            GH -> Known.GH
            GI -> Known.GI
            GR -> Known.GR
            GL -> Known.GL
            GD -> Known.GD
            GP -> Known.GP
            GU -> Known.GU
            GT -> Known.GT
            GG -> Known.GG
            GN -> Known.GN
            GW -> Known.GW
            GY -> Known.GY
            HT -> Known.HT
            HM -> Known.HM
            VA -> Known.VA
            HN -> Known.HN
            HK -> Known.HK
            HU -> Known.HU
            IS -> Known.IS
            IN -> Known.IN
            ID -> Known.ID
            IR -> Known.IR
            IQ -> Known.IQ
            IE -> Known.IE
            IM -> Known.IM
            IL -> Known.IL
            IT -> Known.IT
            JM -> Known.JM
            JP -> Known.JP
            JE -> Known.JE
            JO -> Known.JO
            KZ -> Known.KZ
            KE -> Known.KE
            KI -> Known.KI
            KP -> Known.KP
            KR -> Known.KR
            KW -> Known.KW
            KG -> Known.KG
            LA -> Known.LA
            LV -> Known.LV
            LB -> Known.LB
            LS -> Known.LS
            LR -> Known.LR
            LY -> Known.LY
            LI -> Known.LI
            LT -> Known.LT
            LU -> Known.LU
            MO -> Known.MO
            MK -> Known.MK
            MG -> Known.MG
            MW -> Known.MW
            MY -> Known.MY
            MV -> Known.MV
            ML -> Known.ML
            MT -> Known.MT
            MH -> Known.MH
            MQ -> Known.MQ
            MR -> Known.MR
            MU -> Known.MU
            YT -> Known.YT
            MX -> Known.MX
            FM -> Known.FM
            MD -> Known.MD
            MC -> Known.MC
            MN -> Known.MN
            ME -> Known.ME
            MS -> Known.MS
            MA -> Known.MA
            MZ -> Known.MZ
            MM -> Known.MM
            NA -> Known.NA
            NR -> Known.NR
            NP -> Known.NP
            NL -> Known.NL
            NC -> Known.NC
            NZ -> Known.NZ
            NI -> Known.NI
            NE -> Known.NE
            NG -> Known.NG
            NU -> Known.NU
            NF -> Known.NF
            MP -> Known.MP
            NO -> Known.NO
            OM -> Known.OM
            PK -> Known.PK
            PW -> Known.PW
            PS -> Known.PS
            PA -> Known.PA
            PG -> Known.PG
            PY -> Known.PY
            PE -> Known.PE
            PH -> Known.PH
            PN -> Known.PN
            PL -> Known.PL
            PT -> Known.PT
            PR -> Known.PR
            QA -> Known.QA
            RE -> Known.RE
            RO -> Known.RO
            RU -> Known.RU
            RW -> Known.RW
            BL -> Known.BL
            SH -> Known.SH
            KN -> Known.KN
            LC -> Known.LC
            MF -> Known.MF
            PM -> Known.PM
            VC -> Known.VC
            WS -> Known.WS
            SM -> Known.SM
            ST -> Known.ST
            SA -> Known.SA
            SN -> Known.SN
            RS -> Known.RS
            SC -> Known.SC
            SL -> Known.SL
            SG -> Known.SG
            SX -> Known.SX
            SK -> Known.SK
            SI -> Known.SI
            SB -> Known.SB
            SO -> Known.SO
            ZA -> Known.ZA
            GS -> Known.GS
            SS -> Known.SS
            ES -> Known.ES
            LK -> Known.LK
            SD -> Known.SD
            SR -> Known.SR
            SJ -> Known.SJ
            SZ -> Known.SZ
            SE -> Known.SE
            CH -> Known.CH
            SY -> Known.SY
            TW -> Known.TW
            TJ -> Known.TJ
            TZ -> Known.TZ
            TH -> Known.TH
            TL -> Known.TL
            TG -> Known.TG
            TK -> Known.TK
            TO -> Known.TO
            TT -> Known.TT
            TN -> Known.TN
            TR -> Known.TR
            TM -> Known.TM
            TC -> Known.TC
            TV -> Known.TV
            UG -> Known.UG
            UA -> Known.UA
            AE -> Known.AE
            GB -> Known.GB
            UM -> Known.UM
            US -> Known.US
            UY -> Known.UY
            UZ -> Known.UZ
            VU -> Known.VU
            VE -> Known.VE
            VN -> Known.VN
            VG -> Known.VG
            VI -> Known.VI
            WF -> Known.WF
            EH -> Known.EH
            YE -> Known.YE
            ZM -> Known.ZM
            ZW -> Known.ZW
            else -> throw DodoPaymentsInvalidDataException("Unknown CountryCode: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws DodoPaymentsInvalidDataException if this class instance's value does not have the
     *   expected primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow {
            DodoPaymentsInvalidDataException("Value is not a String")
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CountryCode && value == other.value /* spotless:on */
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
