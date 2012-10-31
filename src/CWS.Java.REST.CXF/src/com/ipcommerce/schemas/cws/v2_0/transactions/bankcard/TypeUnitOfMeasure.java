
package com.ipcommerce.schemas.cws.v2_0.transactions.bankcard;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeUnitOfMeasure.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TypeUnitOfMeasure">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSet"/>
 *     &lt;enumeration value="Acre"/>
 *     &lt;enumeration value="AmpereHour"/>
 *     &lt;enumeration value="Ampere"/>
 *     &lt;enumeration value="Year"/>
 *     &lt;enumeration value="TroyOunceOrApothecariesOunce"/>
 *     &lt;enumeration value="Are"/>
 *     &lt;enumeration value="AlcoholicStrengthByMass"/>
 *     &lt;enumeration value="AlcoholicStrengthByVolume"/>
 *     &lt;enumeration value="StandardAtmosphere"/>
 *     &lt;enumeration value="TechnicalAtmosphere"/>
 *     &lt;enumeration value="Bar"/>
 *     &lt;enumeration value="BoardFoot"/>
 *     &lt;enumeration value="BrakeHorsePower"/>
 *     &lt;enumeration value="BillionEURTrillionUS"/>
 *     &lt;enumeration value="DryBarrelUS"/>
 *     &lt;enumeration value="BarrelUSPetroleumEtc"/>
 *     &lt;enumeration value="Becquerel"/>
 *     &lt;enumeration value="BritishThermalUnit"/>
 *     &lt;enumeration value="BushelUS"/>
 *     &lt;enumeration value="BushelUK"/>
 *     &lt;enumeration value="CarryingCapacityInMetricTon"/>
 *     &lt;enumeration value="Candela"/>
 *     &lt;enumeration value="DegreeCelsius"/>
 *     &lt;enumeration value="Hundred"/>
 *     &lt;enumeration value="Centigram"/>
 *     &lt;enumeration value="CoulombPerKilogram"/>
 *     &lt;enumeration value="HundredLeave"/>
 *     &lt;enumeration value="Centilitre"/>
 *     &lt;enumeration value="Centiliter"/>
 *     &lt;enumeration value="SquareCentimetre"/>
 *     &lt;enumeration value="SquareCentimeter"/>
 *     &lt;enumeration value="CubicCentimetre"/>
 *     &lt;enumeration value="CubicCentimeter"/>
 *     &lt;enumeration value="Centimetre"/>
 *     &lt;enumeration value="Centimeter"/>
 *     &lt;enumeration value="HundredPack"/>
 *     &lt;enumeration value="CentalUK"/>
 *     &lt;enumeration value="Coulomb"/>
 *     &lt;enumeration value="MetricCarat"/>
 *     &lt;enumeration value="Curie"/>
 *     &lt;enumeration value="HundredPoundsCWTHundredWeightUS"/>
 *     &lt;enumeration value="HundredWeightUK"/>
 *     &lt;enumeration value="Decare"/>
 *     &lt;enumeration value="TenDay"/>
 *     &lt;enumeration value="Day"/>
 *     &lt;enumeration value="Decade"/>
 *     &lt;enumeration value="Decilitre"/>
 *     &lt;enumeration value="Deciliter"/>
 *     &lt;enumeration value="SquareDecimetre"/>
 *     &lt;enumeration value="SquareDecimeter"/>
 *     &lt;enumeration value="CubicDecimetre"/>
 *     &lt;enumeration value="CubicDecimeter"/>
 *     &lt;enumeration value="Decimetre"/>
 *     &lt;enumeration value="Decimeter"/>
 *     &lt;enumeration value="DozenPiece"/>
 *     &lt;enumeration value="DozenPair"/>
 *     &lt;enumeration value="DisplacementTonnage"/>
 *     &lt;enumeration value="DramUS"/>
 *     &lt;enumeration value="DramUK"/>
 *     &lt;enumeration value="DozenRoll"/>
 *     &lt;enumeration value="DrachmUK"/>
 *     &lt;enumeration value="DecitonneCentnerMetric100KgQuintalMetric100Kg"/>
 *     &lt;enumeration value="Pennyweight"/>
 *     &lt;enumeration value="Dozen"/>
 *     &lt;enumeration value="DozenPack"/>
 *     &lt;enumeration value="DegreeFahrenheit"/>
 *     &lt;enumeration value="Farad"/>
 *     &lt;enumeration value="Foot"/>
 *     &lt;enumeration value="SquareFoot"/>
 *     &lt;enumeration value="CubicFoot"/>
 *     &lt;enumeration value="Gigabecquerel"/>
 *     &lt;enumeration value="GramOfFissileIsotope"/>
 *     &lt;enumeration value="GreatGross"/>
 *     &lt;enumeration value="GillUS"/>
 *     &lt;enumeration value="GillUK"/>
 *     &lt;enumeration value="DryGallonUS"/>
 *     &lt;enumeration value="GallonUK"/>
 *     &lt;enumeration value="GallonUS"/>
 *     &lt;enumeration value="Gram"/>
 *     &lt;enumeration value="Grain"/>
 *     &lt;enumeration value="Gross"/>
 *     &lt;enumeration value="GrossRegisterTon"/>
 *     &lt;enumeration value="GigawattHour"/>
 *     &lt;enumeration value="Hectare"/>
 *     &lt;enumeration value="Hectobar"/>
 *     &lt;enumeration value="HundredBox"/>
 *     &lt;enumeration value="Hectogram"/>
 *     &lt;enumeration value="HundredInternationalUnit"/>
 *     &lt;enumeration value="Hectolitre"/>
 *     &lt;enumeration value="Hectoliter"/>
 *     &lt;enumeration value="MillionCubicMetre"/>
 *     &lt;enumeration value="MillionCubicMeter"/>
 *     &lt;enumeration value="Hectometre"/>
 *     &lt;enumeration value="Hectometer"/>
 *     &lt;enumeration value="HectolitreOfPureAlcohol"/>
 *     &lt;enumeration value="HectoliterOfPureAlcohol"/>
 *     &lt;enumeration value="Hertz"/>
 *     &lt;enumeration value="Hour"/>
 *     &lt;enumeration value="Inch"/>
 *     &lt;enumeration value="SquareInch"/>
 *     &lt;enumeration value="CubicInch"/>
 *     &lt;enumeration value="Joule"/>
 *     &lt;enumeration value="Kilobar"/>
 *     &lt;enumeration value="Kelvin"/>
 *     &lt;enumeration value="Kilogram"/>
 *     &lt;enumeration value="KilogramPerSecond"/>
 *     &lt;enumeration value="Kilohertz"/>
 *     &lt;enumeration value="Kilojoule"/>
 *     &lt;enumeration value="KilometrePerHour"/>
 *     &lt;enumeration value="KilometerPerHour"/>
 *     &lt;enumeration value="SquareKilometre"/>
 *     &lt;enumeration value="SquareKilometer"/>
 *     &lt;enumeration value="KilogramPerCubicMetre"/>
 *     &lt;enumeration value="KilogramPerCubicMeter"/>
 *     &lt;enumeration value="Kilometre"/>
 *     &lt;enumeration value="Kilometer"/>
 *     &lt;enumeration value="KilogramOfNitrogen"/>
 *     &lt;enumeration value="KilogramNamedSubstance"/>
 *     &lt;enumeration value="Knot"/>
 *     &lt;enumeration value="Kilopascal"/>
 *     &lt;enumeration value="KilogramOfPotassiumHydroxideCausticPotash"/>
 *     &lt;enumeration value="KilogramOfPotassiumOxide"/>
 *     &lt;enumeration value="KilogramOfPhosphorusPentoxidePhosphoricAnhydride"/>
 *     &lt;enumeration value="KilogramOfSubstance90PercentDry"/>
 *     &lt;enumeration value="KilogramOfSodiumHydroxideCausticSoda"/>
 *     &lt;enumeration value="Kilotonne"/>
 *     &lt;enumeration value="KilogramOfUranium"/>
 *     &lt;enumeration value="KilovoltAmpere"/>
 *     &lt;enumeration value="Kilovar"/>
 *     &lt;enumeration value="Kilovolt"/>
 *     &lt;enumeration value="KilowattHour"/>
 *     &lt;enumeration value="Kilowatt"/>
 *     &lt;enumeration value="Pound"/>
 *     &lt;enumeration value="TroyPoundUS"/>
 *     &lt;enumeration value="Leaf"/>
 *     &lt;enumeration value="LitreOfPureAlcohol"/>
 *     &lt;enumeration value="LiterOfPureAlcohol"/>
 *     &lt;enumeration value="TonUKorLongTonUS"/>
 *     &lt;enumeration value="Litre"/>
 *     &lt;enumeration value="Liter"/>
 *     &lt;enumeration value="Lumen"/>
 *     &lt;enumeration value="Lux"/>
 *     &lt;enumeration value="MegaLitre"/>
 *     &lt;enumeration value="MegaLiter"/>
 *     &lt;enumeration value="Megametre"/>
 *     &lt;enumeration value="Megameter"/>
 *     &lt;enumeration value="Megawatt"/>
 *     &lt;enumeration value="ThousandStandardBrickEquivalent"/>
 *     &lt;enumeration value="ThousandBoardFeet"/>
 *     &lt;enumeration value="Millibar"/>
 *     &lt;enumeration value="Millicurie"/>
 *     &lt;enumeration value="Milligram"/>
 *     &lt;enumeration value="Megahertz"/>
 *     &lt;enumeration value="SquareMile"/>
 *     &lt;enumeration value="Thousand"/>
 *     &lt;enumeration value="Minute"/>
 *     &lt;enumeration value="Million"/>
 *     &lt;enumeration value="MillionInternationalUnit"/>
 *     &lt;enumeration value="MilliardBillionUS"/>
 *     &lt;enumeration value="Millilitre"/>
 *     &lt;enumeration value="Milliliter"/>
 *     &lt;enumeration value="SquareMillimetre"/>
 *     &lt;enumeration value="SquareMillimeter"/>
 *     &lt;enumeration value="CubicMillimetre"/>
 *     &lt;enumeration value="CubicMillimeter"/>
 *     &lt;enumeration value="Millimetre"/>
 *     &lt;enumeration value="Millimeter"/>
 *     &lt;enumeration value="Month"/>
 *     &lt;enumeration value="Megapascal"/>
 *     &lt;enumeration value="CubicMetrePerHour"/>
 *     &lt;enumeration value="CubicMeterPerHour"/>
 *     &lt;enumeration value="CubicMetrePerSecond"/>
 *     &lt;enumeration value="CubicMeterPerSecond"/>
 *     &lt;enumeration value="MetrePerSecondSquared"/>
 *     &lt;enumeration value="MeterPerSecondSquared"/>
 *     &lt;enumeration value="SquareMetre"/>
 *     &lt;enumeration value="SquareMeter"/>
 *     &lt;enumeration value="CubicMetre"/>
 *     &lt;enumeration value="CubicMeter"/>
 *     &lt;enumeration value="Metre"/>
 *     &lt;enumeration value="Meter"/>
 *     &lt;enumeration value="MetrePerSecond"/>
 *     &lt;enumeration value="MeterPerSecond"/>
 *     &lt;enumeration value="MegavoltAmpere"/>
 *     &lt;enumeration value="MegawattHour1000KWH"/>
 *     &lt;enumeration value="NumberOfArticles"/>
 *     &lt;enumeration value="NumberOfBobbins"/>
 *     &lt;enumeration value="NumberOfCells"/>
 *     &lt;enumeration value="Newton"/>
 *     &lt;enumeration value="NumberOfInternationalUnits"/>
 *     &lt;enumeration value="NauticalMile"/>
 *     &lt;enumeration value="NumberOfPacks"/>
 *     &lt;enumeration value="NumberOfParcels"/>
 *     &lt;enumeration value="NumberOfPairs"/>
 *     &lt;enumeration value="NumberOfParts"/>
 *     &lt;enumeration value="NumberOfRolls"/>
 *     &lt;enumeration value="NetRegisterTon"/>
 *     &lt;enumeration value="Ohm"/>
 *     &lt;enumeration value="Ounce"/>
 *     &lt;enumeration value="FluidOunceUS"/>
 *     &lt;enumeration value="FluidOunceUK"/>
 *     &lt;enumeration value="Pascal"/>
 *     &lt;enumeration value="Piece"/>
 *     &lt;enumeration value="ProofGallon"/>
 *     &lt;enumeration value="DryPintUS"/>
 *     &lt;enumeration value="PintUK"/>
 *     &lt;enumeration value="LiquidPintUS"/>
 *     &lt;enumeration value="QuarterOfAYear"/>
 *     &lt;enumeration value="DryQuartUS"/>
 *     &lt;enumeration value="QuartUK"/>
 *     &lt;enumeration value="LiquidQuartUS"/>
 *     &lt;enumeration value="QuarterUK"/>
 *     &lt;enumeration value="RevolutionsPerMinute"/>
 *     &lt;enumeration value="RevolutionsPerSecond"/>
 *     &lt;enumeration value="HalfYear6Months"/>
 *     &lt;enumeration value="Score"/>
 *     &lt;enumeration value="Scruple"/>
 *     &lt;enumeration value="Second"/>
 *     &lt;enumeration value="Set"/>
 *     &lt;enumeration value="ShippingTon"/>
 *     &lt;enumeration value="Siemens"/>
 *     &lt;enumeration value="MileStatuteMile"/>
 *     &lt;enumeration value="ShortStandard7200Matches"/>
 *     &lt;enumeration value="StoneUK"/>
 *     &lt;enumeration value="TonUSOrShortTonUKUS"/>
 *     &lt;enumeration value="KiloampereHourThousandAmpereHour"/>
 *     &lt;enumeration value="TonneMetricTon"/>
 *     &lt;enumeration value="TenPair"/>
 *     &lt;enumeration value="ThousandCubicMetrePerDay"/>
 *     &lt;enumeration value="ThousandCubicMeterPerDay"/>
 *     &lt;enumeration value="TrillionEUR"/>
 *     &lt;enumeration value="TonneOfSubstance90PercentDry"/>
 *     &lt;enumeration value="TonOfSteamPerHour"/>
 *     &lt;enumeration value="Volt"/>
 *     &lt;enumeration value="Cord"/>
 *     &lt;enumeration value="Weber"/>
 *     &lt;enumeration value="Week"/>
 *     &lt;enumeration value="WattHour"/>
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Watt"/>
 *     &lt;enumeration value="SquareYard"/>
 *     &lt;enumeration value="CubicYard"/>
 *     &lt;enumeration value="Yard"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TypeUnitOfMeasure")
@XmlEnum
public enum TypeUnitOfMeasure {


    /**
     * <summary>
     *             Value has not been explicitly set.
     *             </summary>
     * 
     */
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet"),

    /**
     * <summary>
     *             ACR - 077 - Acre
     *             </summary>
     * 
     */
    @XmlEnumValue("Acre")
    ACRE("Acre"),

    /**
     * <summary>
     *             AMH - 263 - Ampere Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("AmpereHour")
    AMPERE_HOUR("AmpereHour"),

    /**
     * <summary>
     *             AMP - 260 - Ampere
     *             </summary>
     * 
     */
    @XmlEnumValue("Ampere")
    AMPERE("Ampere"),

    /**
     * <summary>
     *             ANN - 366 - Year
     *             </summary>
     * 
     */
    @XmlEnumValue("Year")
    YEAR("Year"),

    /**
     * <summary>
     *             APZ - 201 - Troy Ounce Or Apothecaries Ounce
     *             </summary>
     * 
     */
    @XmlEnumValue("TroyOunceOrApothecariesOunce")
    TROY_OUNCE_OR_APOTHECARIES_OUNCE("TroyOunceOrApothecariesOunce"),

    /**
     * <summary>
     *             ARE - 109 - Are
     *             </summary>
     * 
     */
    @XmlEnumValue("Are")
    ARE("Are"),

    /**
     * <summary>
     *             ASM - 820 - Alcoholic Strength By Mass
     *             </summary>
     * 
     */
    @XmlEnumValue("AlcoholicStrengthByMass")
    ALCOHOLIC_STRENGTH_BY_MASS("AlcoholicStrengthByMass"),

    /**
     * <summary>
     *             ASU - 821 - Alcoholic Strength By Volume
     *             </summary>
     * 
     */
    @XmlEnumValue("AlcoholicStrengthByVolume")
    ALCOHOLIC_STRENGTH_BY_VOLUME("AlcoholicStrengthByVolume"),

    /**
     * <summary>
     *             ATM - 300 - Standard Atmosphere
     *             </summary>
     * 
     */
    @XmlEnumValue("StandardAtmosphere")
    STANDARD_ATMOSPHERE("StandardAtmosphere"),

    /**
     * <summary>
     *             ATT - 301 - Technical Atmosphere
     *             </summary>
     * 
     */
    @XmlEnumValue("TechnicalAtmosphere")
    TECHNICAL_ATMOSPHERE("TechnicalAtmosphere"),

    /**
     * <summary>
     *             BAR - 309 - Bar
     *             </summary>
     * 
     */
    @XmlEnumValue("Bar")
    BAR("Bar"),

    /**
     * <summary>
     *             BFT - 154 - Board Foot
     *             </summary>
     * 
     */
    @XmlEnumValue("BoardFoot")
    BOARD_FOOT("BoardFoot"),

    /**
     * <summary>
     *             BHP - 213 - Brake Horse Power
     *             </summary>
     * 
     */
    @XmlEnumValue("BrakeHorsePower")
    BRAKE_HORSE_POWER("BrakeHorsePower"),

    /**
     * <summary>
     *             BIL - 801 - Billion (EUR)/Trillion (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("BillionEURTrillionUS")
    BILLION_EUR_TRILLION_US("BillionEURTrillionUS"),

    /**
     * <summary>
     *             BLD - 151 - Dry Barrel (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("DryBarrelUS")
    DRY_BARREL_US("DryBarrelUS"),

    /**
     * <summary>
     *             BLL - 146 - Barrel (US) (Petroleum Etc.)
     *             </summary>
     * 
     */
    @XmlEnumValue("BarrelUSPetroleumEtc")
    BARREL_US_PETROLEUM_ETC("BarrelUSPetroleumEtc"),

    /**
     * <summary>
     *             BQL - 323 - Becquerel
     *             </summary>
     * 
     */
    @XmlEnumValue("Becquerel")
    BECQUEREL("Becquerel"),

    /**
     * <summary>
     *             BTU - 275 - British Thermal Unit
     *             </summary>
     * 
     */
    @XmlEnumValue("BritishThermalUnit")
    BRITISH_THERMAL_UNIT("BritishThermalUnit"),

    /**
     * <summary>
     *             BUA - 150 - Bushel (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("BushelUS")
    BUSHEL_US("BushelUS"),

    /**
     * <summary>
     *             BUI - 140 - Bushel (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("BushelUK")
    BUSHEL_UK("BushelUK"),

    /**
     * <summary>
     *             CCT - 185 - Carrying Capacity In Metric Ton
     *             </summary>
     * 
     */
    @XmlEnumValue("CarryingCapacityInMetricTon")
    CARRYING_CAPACITY_IN_METRIC_TON("CarryingCapacityInMetricTon"),

    /**
     * <summary>
     *             CDL - 282 - Candela
     *             </summary>
     * 
     */
    @XmlEnumValue("Candela")
    CANDELA("Candela"),

    /**
     * <summary>
     *             CEL - 280 - Degree Celsius
     *             </summary>
     * 
     */
    @XmlEnumValue("DegreeCelsius")
    DEGREE_CELSIUS("DegreeCelsius"),

    /**
     * <summary>
     *             CEN - 797 - Hundred
     *             </summary>
     * 
     */
    @XmlEnumValue("Hundred")
    HUNDRED("Hundred"),

    /**
     * <summary>
     *             CGM - 173 - Centigram
     *             </summary>
     * 
     */
    @XmlEnumValue("Centigram")
    CENTIGRAM("Centigram"),

    /**
     * <summary>
     *             CKG - 349 - Coulomb Per Kilogram
     *             </summary>
     * 
     */
    @XmlEnumValue("CoulombPerKilogram")
    COULOMB_PER_KILOGRAM("CoulombPerKilogram"),

    /**
     * <summary>
     *             CLF - 626 - Hundred Leave
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredLeave")
    HUNDRED_LEAVE("HundredLeave"),

    /**
     * <summary>
     *             CLT - 117 - Centilitre
     *             </summary>
     * 
     */
    @XmlEnumValue("Centilitre")
    CENTILITRE("Centilitre"),

    /**
     * <summary>
     *             CLT - 117 - Centiliter
     *             </summary>
     * 
     */
    @XmlEnumValue("Centiliter")
    CENTILITER("Centiliter"),

    /**
     * <summary>
     *             CMK - 051 - Square Centimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareCentimetre")
    SQUARE_CENTIMETRE("SquareCentimetre"),

    /**
     * <summary>
     *             CMK - 051 - Square Centimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareCentimeter")
    SQUARE_CENTIMETER("SquareCentimeter"),

    /**
     * <summary>
     *             CMQ - 111 - Cubic Centimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicCentimetre")
    CUBIC_CENTIMETRE("CubicCentimetre"),

    /**
     * <summary>
     *             CMQ - 111 - Cubic Centimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicCentimeter")
    CUBIC_CENTIMETER("CubicCentimeter"),

    /**
     * <summary>
     *             CMT - 004 - Centimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("Centimetre")
    CENTIMETRE("Centimetre"),

    /**
     * <summary>
     *             CMT - 004 - Centimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("Centimeter")
    CENTIMETER("Centimeter"),

    /**
     * <summary>
     *             CNP - 781 - Hundred Pack
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredPack")
    HUNDRED_PACK("HundredPack"),

    /**
     * <summary>
     *             CNT - 192 - Cental (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("CentalUK")
    CENTAL_UK("CentalUK"),

    /**
     * <summary>
     *             COU - 270 - Coulomb
     *             </summary>
     * 
     */
    @XmlEnumValue("Coulomb")
    COULOMB("Coulomb"),

    /**
     * <summary>
     *             CTM - 162 - Metric Carat
     *             </summary>
     * 
     */
    @XmlEnumValue("MetricCarat")
    METRIC_CARAT("MetricCarat"),

    /**
     * <summary>
     *             CUR - 305 - Curie
     *             </summary>
     * 
     */
    @XmlEnumValue("Curie")
    CURIE("Curie"),

    /**
     * <summary>
     *             CWA - 193 - Hundred Pounds (CWT)/Hundred Weight (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredPoundsCWTHundredWeightUS")
    HUNDRED_POUNDS_CWT_HUNDRED_WEIGHT_US("HundredPoundsCWTHundredWeightUS"),

    /**
     * <summary>
     *             CWI - 194 - Hundred Weight (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredWeightUK")
    HUNDRED_WEIGHT_UK("HundredWeightUK"),

    /**
     * <summary>
     *             DAA - 058 - Decare
     *             </summary>
     * 
     */
    @XmlEnumValue("Decare")
    DECARE("Decare"),

    /**
     * <summary>
     *             DAD - 361 - Ten Day
     *             </summary>
     * 
     */
    @XmlEnumValue("TenDay")
    TEN_DAY("TenDay"),

    /**
     * <summary>
     *             DAY - 359 - Day
     *             </summary>
     * 
     */
    @XmlEnumValue("Day")
    DAY("Day"),

    /**
     * <summary>
     *             DEC - 368 - Decade
     *             </summary>
     * 
     */
    @XmlEnumValue("Decade")
    DECADE("Decade"),

    /**
     * <summary>
     *             DLT - 118 - Decilitre
     *             </summary>
     * 
     */
    @XmlEnumValue("Decilitre")
    DECILITRE("Decilitre"),

    /**
     * <summary>
     *             DLT - 118 - Deciliter
     *             </summary>
     * 
     */
    @XmlEnumValue("Deciliter")
    DECILITER("Deciliter"),

    /**
     * <summary>
     *             DMK - 053 - Square Decimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareDecimetre")
    SQUARE_DECIMETRE("SquareDecimetre"),

    /**
     * <summary>
     *             DMK - 053 - Square Decimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareDecimeter")
    SQUARE_DECIMETER("SquareDecimeter"),

    /**
     * <summary>
     *             DMQ - 112 - Cubic Decimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicDecimetre")
    CUBIC_DECIMETRE("CubicDecimetre"),

    /**
     * <summary>
     *             DMQ - 112 - Cubic Decimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicDecimeter")
    CUBIC_DECIMETER("CubicDecimeter"),

    /**
     * <summary>
     *             DMT - 005 - Decimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("Decimetre")
    DECIMETRE("Decimetre"),

    /**
     * <summary>
     *             DMT - 005 - Decimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("Decimeter")
    DECIMETER("Decimeter"),

    /**
     * <summary>
     *             DPC - 740 - Dozen Piece
     *             </summary>
     * 
     */
    @XmlEnumValue("DozenPiece")
    DOZEN_PIECE("DozenPiece"),

    /**
     * <summary>
     *             DPR - 733 - Dozen Pair
     *             </summary>
     * 
     */
    @XmlEnumValue("DozenPair")
    DOZEN_PAIR("DozenPair"),

    /**
     * <summary>
     *             DPT - 184 - Displacement Tonnage
     *             </summary>
     * 
     */
    @XmlEnumValue("DisplacementTonnage")
    DISPLACEMENT_TONNAGE("DisplacementTonnage"),

    /**
     * <summary>
     *             DRA - 200 - Dram (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("DramUS")
    DRAM_US("DramUS"),

    /**
     * <summary>
     *             DRI - 188 - Dram (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("DramUK")
    DRAM_UK("DramUK"),

    /**
     * <summary>
     *             DRL - 737 - Dozen Roll
     *             </summary>
     * 
     */
    @XmlEnumValue("DozenRoll")
    DOZEN_ROLL("DozenRoll"),

    /**
     * <summary>
     *             DRM - 199 - Drachm (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("DrachmUK")
    DRACHM_UK("DrachmUK"),

    /**
     * <summary>
     *             DTN - 206 - Decitonne / Centner - Metric 100 Kg / Quintal - Metric 100 Kg
     *             </summary>
     * 
     */
    @XmlEnumValue("DecitonneCentnerMetric100KgQuintalMetric100Kg")
    DECITONNE_CENTNER_METRIC_100_KG_QUINTAL_METRIC_100_KG("DecitonneCentnerMetric100KgQuintalMetric100Kg"),

    /**
     * <summary>
     *             DWT - 198 - Pennyweight
     *             </summary>
     * 
     */
    @XmlEnumValue("Pennyweight")
    PENNYWEIGHT("Pennyweight"),

    /**
     * <summary>
     *             DZN - 641 - Dozen
     *             </summary>
     * 
     */
    @XmlEnumValue("Dozen")
    DOZEN("Dozen"),

    /**
     * <summary>
     *             DZP - 780 - Dozen Pack
     *             </summary>
     * 
     */
    @XmlEnumValue("DozenPack")
    DOZEN_PACK("DozenPack"),

    /**
     * <summary>
     *             FAH - 281 - Degree Fahrenheit
     *             </summary>
     * 
     */
    @XmlEnumValue("DegreeFahrenheit")
    DEGREE_FAHRENHEIT("DegreeFahrenheit"),

    /**
     * <summary>
     *             FAR - 314 - Farad
     *             </summary>
     * 
     */
    @XmlEnumValue("Farad")
    FARAD("Farad"),

    /**
     * <summary>
     *             FOT - 041 - Foot
     *             </summary>
     * 
     */
    @XmlEnumValue("Foot")
    FOOT("Foot"),

    /**
     * <summary>
     *             FTK - 073 - Square Foot
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareFoot")
    SQUARE_FOOT("SquareFoot"),

    /**
     * <summary>
     *             FTQ - 132 - Cubic Foot
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicFoot")
    CUBIC_FOOT("CubicFoot"),

    /**
     * <summary>
     *             GBQ - 302 - Gigabecquerel
     *             </summary>
     * 
     */
    @XmlEnumValue("Gigabecquerel")
    GIGABECQUEREL("Gigabecquerel"),

    /**
     * <summary>
     *             GFI - 306 - Gram Of Fissile Isotope
     *             </summary>
     * 
     */
    @XmlEnumValue("GramOfFissileIsotope")
    GRAM_OF_FISSILE_ISOTOPE("GramOfFissileIsotope"),

    /**
     * <summary>
     *             GGR - 731 - Great Gross
     *             </summary>
     * 
     */
    @XmlEnumValue("GreatGross")
    GREAT_GROSS("GreatGross"),

    /**
     * <summary>
     *             GIA - 142 - Gill (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("GillUS")
    GILL_US("GillUS"),

    /**
     * <summary>
     *             GII - 136 - Gill (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("GillUK")
    GILL_UK("GillUK"),

    /**
     * <summary>
     *             GLD - 149 - Dry Gallon (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("DryGallonUS")
    DRY_GALLON_US("DryGallonUS"),

    /**
     * <summary>
     *             GLI - 139 - Gallon (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("GallonUK")
    GALLON_UK("GallonUK"),

    /**
     * <summary>
     *             GLL - 145 - Gallon (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("GallonUS")
    GALLON_US("GallonUS"),

    /**
     * <summary>
     *             GRM - 163 - Gram
     *             </summary>
     * 
     */
    @XmlEnumValue("Gram")
    GRAM("Gram"),

    /**
     * <summary>
     *             GRN - 189 - Grain
     *             </summary>
     * 
     */
    @XmlEnumValue("Grain")
    GRAIN("Grain"),

    /**
     * <summary>
     *             GRO - 638 - Gross
     *             </summary>
     * 
     */
    @XmlEnumValue("Gross")
    GROSS("Gross"),

    /**
     * <summary>
     *             GRT - 181 - Gross Register Ton
     *             </summary>
     * 
     */
    @XmlEnumValue("GrossRegisterTon")
    GROSS_REGISTER_TON("GrossRegisterTon"),

    /**
     * <summary>
     *             GWH - 247 - Gigawatt Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("GigawattHour")
    GIGAWATT_HOUR("GigawattHour"),

    /**
     * <summary>
     *             HAR - 059 - Hectare
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectare")
    HECTARE("Hectare"),

    /**
     * <summary>
     *             HBA - 310 - Hectobar
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectobar")
    HECTOBAR("Hectobar"),

    /**
     * <summary>
     *             HBX - 683 - Hundred Box
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredBox")
    HUNDRED_BOX("HundredBox"),

    /**
     * <summary>
     *             HGM - 160 - Hectogram
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectogram")
    HECTOGRAM("Hectogram"),

    /**
     * <summary>
     *             HIU - 853 - Hundred International Unit
     *             </summary>
     * 
     */
    @XmlEnumValue("HundredInternationalUnit")
    HUNDRED_INTERNATIONAL_UNIT("HundredInternationalUnit"),

    /**
     * <summary>
     *             HLT - 122 - Hectolitre
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectolitre")
    HECTOLITRE("Hectolitre"),

    /**
     * <summary>
     *             HLT - 122 - Hectoliter
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectoliter")
    HECTOLITER("Hectoliter"),

    /**
     * <summary>
     *             HMQ - 159 - Million Cubic Metre
     *             </summary>
     * 
     */
    @XmlEnumValue("MillionCubicMetre")
    MILLION_CUBIC_METRE("MillionCubicMetre"),

    /**
     * <summary>
     *             HMQ - 159 - Million Cubic Meter
     *             </summary>
     * 
     */
    @XmlEnumValue("MillionCubicMeter")
    MILLION_CUBIC_METER("MillionCubicMeter"),

    /**
     * <summary>
     *             HMT - 017 - Hectometre
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectometre")
    HECTOMETRE("Hectometre"),

    /**
     * <summary>
     *             HMT - 017 - Hectometer
     *             </summary>
     * 
     */
    @XmlEnumValue("Hectometer")
    HECTOMETER("Hectometer"),

    /**
     * <summary>
     *             HPA - 833 - Hectolitre Of Pure Alcohol
     *             </summary>
     * 
     */
    @XmlEnumValue("HectolitreOfPureAlcohol")
    HECTOLITRE_OF_PURE_ALCOHOL("HectolitreOfPureAlcohol"),

    /**
     * <summary>
     *             HPA - 833 - Hectoliter Of Pure Alcohol
     *             </summary>
     * 
     */
    @XmlEnumValue("HectoliterOfPureAlcohol")
    HECTOLITER_OF_PURE_ALCOHOL("HectoliterOfPureAlcohol"),

    /**
     * <summary>
     *             HTZ - 290 - Hertz
     *             </summary>
     * 
     */
    @XmlEnumValue("Hertz")
    HERTZ("Hertz"),

    /**
     * <summary>
     *             HUR - 356 - Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("Hour")
    HOUR("Hour"),

    /**
     * <summary>
     *             INH - 039 - Inch
     *             </summary>
     * 
     */
    @XmlEnumValue("Inch")
    INCH("Inch"),

    /**
     * <summary>
     *             INK - 071 - Square Inch
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareInch")
    SQUARE_INCH("SquareInch"),

    /**
     * <summary>
     *             INQ - 131 - Cubic Inch
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicInch")
    CUBIC_INCH("CubicInch"),

    /**
     * <summary>
     *             JOU - 271 - Joule
     *             </summary>
     * 
     */
    @XmlEnumValue("Joule")
    JOULE("Joule"),

    /**
     * <summary>
     *             KBA - 312 - Kilobar
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilobar")
    KILOBAR("Kilobar"),

    /**
     * <summary>
     *             KEL - 288 - Kelvin
     *             </summary>
     * 
     */
    @XmlEnumValue("Kelvin")
    KELVIN("Kelvin"),

    /**
     * <summary>
     *             KGM - 166 - Kilogram
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),

    /**
     * <summary>
     *             KGS - 499 - Kilogram Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramPerSecond")
    KILOGRAM_PER_SECOND("KilogramPerSecond"),

    /**
     * <summary>
     *             KHZ - 291 - Kilohertz
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilohertz")
    KILOHERTZ("Kilohertz"),

    /**
     * <summary>
     *             KJO - 273 - Kilojoule
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilojoule")
    KILOJOULE("Kilojoule"),

    /**
     * <summary>
     *             KMH - 333 - Kilometre Per Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("KilometrePerHour")
    KILOMETRE_PER_HOUR("KilometrePerHour"),

    /**
     * <summary>
     *             KMH - 333 - Kilometer Per Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("KilometerPerHour")
    KILOMETER_PER_HOUR("KilometerPerHour"),

    /**
     * <summary>
     *             KMK - 061 - Square Kilometre
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareKilometre")
    SQUARE_KILOMETRE("SquareKilometre"),

    /**
     * <summary>
     *             KMK - 061 - Square Kilometer
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareKilometer")
    SQUARE_KILOMETER("SquareKilometer"),

    /**
     * <summary>
     *             KMQ - 316 - Kilogram Per Cubic Metre
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramPerCubicMetre")
    KILOGRAM_PER_CUBIC_METRE("KilogramPerCubicMetre"),

    /**
     * <summary>
     *             KMQ - 316 - Kilogram Per Cubic Meter
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramPerCubicMeter")
    KILOGRAM_PER_CUBIC_METER("KilogramPerCubicMeter"),

    /**
     * <summary>
     *             KMT - 008 - Kilometre
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilometre")
    KILOMETRE("Kilometre"),

    /**
     * <summary>
     *             KMT - 008 - Kilometer
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilometer")
    KILOMETER("Kilometer"),

    /**
     * <summary>
     *             KNI - 861 - Kilogram Of Nitrogen
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfNitrogen")
    KILOGRAM_OF_NITROGEN("KilogramOfNitrogen"),

    /**
     * <summary>
     *             KNS - 841 - Kilogram Named Substance
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramNamedSubstance")
    KILOGRAM_NAMED_SUBSTANCE("KilogramNamedSubstance"),

    /**
     * <summary>
     *             KNT - 327 - Knot
     *             </summary>
     * 
     */
    @XmlEnumValue("Knot")
    KNOT("Knot"),

    /**
     * <summary>
     *             KPA - 297 - Kilopascal
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilopascal")
    KILOPASCAL("Kilopascal"),

    /**
     * <summary>
     *             KPH - 859 - Kilogram Of Potassium Hydroxide (Caustic Potash)
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfPotassiumHydroxideCausticPotash")
    KILOGRAM_OF_POTASSIUM_HYDROXIDE_CAUSTIC_POTASH("KilogramOfPotassiumHydroxideCausticPotash"),

    /**
     * <summary>
     *             KPO - 857 - Kilogram Of Potassium Oxide
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfPotassiumOxide")
    KILOGRAM_OF_POTASSIUM_OXIDE("KilogramOfPotassiumOxide"),

    /**
     * <summary>
     *             KPP - 865 - Kilogram Of Phosphorus Pentoxide (Phosphoric Anhydride)
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfPhosphorusPentoxidePhosphoricAnhydride")
    KILOGRAM_OF_PHOSPHORUS_PENTOXIDE_PHOSPHORIC_ANHYDRIDE("KilogramOfPhosphorusPentoxidePhosphoricAnhydride"),

    /**
     * <summary>
     *             KSD - 845 - Kilogram Of Substance 90% Dry
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfSubstance90PercentDry")
    KILOGRAM_OF_SUBSTANCE_90_PERCENT_DRY("KilogramOfSubstance90PercentDry"),

    /**
     * <summary>
     *             KSH - 863 - Kilogram Of Sodium Hydroxide (Caustic Soda)
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfSodiumHydroxideCausticSoda")
    KILOGRAM_OF_SODIUM_HYDROXIDE_CAUSTIC_SODA("KilogramOfSodiumHydroxideCausticSoda"),

    /**
     * <summary>
     *             KTN - 170 - Kilotonne
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilotonne")
    KILOTONNE("Kilotonne"),

    /**
     * <summary>
     *             KUR - 867 - Kilogram Of Uranium
     *             </summary>
     * 
     */
    @XmlEnumValue("KilogramOfUranium")
    KILOGRAM_OF_URANIUM("KilogramOfUranium"),

    /**
     * <summary>
     *             KVA - 227 - Kilovolt - Ampere
     *             </summary>
     * 
     */
    @XmlEnumValue("KilovoltAmpere")
    KILOVOLT_AMPERE("KilovoltAmpere"),

    /**
     * <summary>
     *             KVR - 230 - Kilovar
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilovar")
    KILOVAR("Kilovar"),

    /**
     * <summary>
     *             KVT - 223 - Kilovolt
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilovolt")
    KILOVOLT("Kilovolt"),

    /**
     * <summary>
     *             KWH - 245 - Kilowatt Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("KilowattHour")
    KILOWATT_HOUR("KilowattHour"),

    /**
     * <summary>
     *             KWT - 214 - Kilowatt
     *             </summary>
     * 
     */
    @XmlEnumValue("Kilowatt")
    KILOWATT("Kilowatt"),

    /**
     * <summary>
     *             LBR - 186 - Pound
     *             </summary>
     * 
     */
    @XmlEnumValue("Pound")
    POUND("Pound"),

    /**
     * <summary>
     *             LBT - 202 - Troy Pound (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("TroyPoundUS")
    TROY_POUND_US("TroyPoundUS"),

    /**
     * <summary>
     *             LEF - 625 - Leaf
     *             </summary>
     * 
     */
    @XmlEnumValue("Leaf")
    LEAF("Leaf"),

    /**
     * <summary>
     *             LPA - 831 - Litre Of Pure Alcohol
     *             </summary>
     * 
     */
    @XmlEnumValue("LitreOfPureAlcohol")
    LITRE_OF_PURE_ALCOHOL("LitreOfPureAlcohol"),

    /**
     * <summary>
     *             LPA - 831 - Liter Of Pure Alcohol
     *             </summary>
     * 
     */
    @XmlEnumValue("LiterOfPureAlcohol")
    LITER_OF_PURE_ALCOHOL("LiterOfPureAlcohol"),

    /**
     * <summary>
     *             LTN - 196 - Ton (UK) or Long Ton (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("TonUKorLongTonUS")
    TON_U_KOR_LONG_TON_US("TonUKorLongTonUS"),

    /**
     * <summary>
     *             LTR - 112 - Litre
     *             </summary>
     * 
     */
    @XmlEnumValue("Litre")
    LITRE("Litre"),

    /**
     * <summary>
     *             LTR - 112 - Liter
     *             </summary>
     * 
     */
    @XmlEnumValue("Liter")
    LITER("Liter"),

    /**
     * <summary>
     *             LUM - 284 - Lumen
     *             </summary>
     * 
     */
    @XmlEnumValue("Lumen")
    LUMEN("Lumen"),

    /**
     * <summary>
     *             LUX - 283 - Lux
     *             </summary>
     * 
     */
    @XmlEnumValue("Lux")
    LUX("Lux"),

    /**
     * <summary>
     *             MAL - 126 - Mega Litre
     *             </summary>
     * 
     */
    @XmlEnumValue("MegaLitre")
    MEGA_LITRE("MegaLitre"),

    /**
     * <summary>
     *             MAL - 126 - Mega Liter
     *             </summary>
     * 
     */
    @XmlEnumValue("MegaLiter")
    MEGA_LITER("MegaLiter"),

    /**
     * <summary>
     *             MAM - 009 - Megametre
     *             </summary>
     * 
     */
    @XmlEnumValue("Megametre")
    MEGAMETRE("Megametre"),

    /**
     * <summary>
     *             MAM - 009 - Megameter
     *             </summary>
     * 
     */
    @XmlEnumValue("Megameter")
    MEGAMETER("Megameter"),

    /**
     * <summary>
     *             MAW - 215 - Megawatt
     *             </summary>
     * 
     */
    @XmlEnumValue("Megawatt")
    MEGAWATT("Megawatt"),

    /**
     * <summary>
     *             MBE - 630 - Thousand Standard Brick Equivalent
     *             </summary>
     * 
     */
    @XmlEnumValue("ThousandStandardBrickEquivalent")
    THOUSAND_STANDARD_BRICK_EQUIVALENT("ThousandStandardBrickEquivalent"),

    /**
     * <summary>
     *             MBF - 155 - Thousand Board Feet
     *             </summary>
     * 
     */
    @XmlEnumValue("ThousandBoardFeet")
    THOUSAND_BOARD_FEET("ThousandBoardFeet"),

    /**
     * <summary>
     *             MBR - 308 - Millibar
     *             </summary>
     * 
     */
    @XmlEnumValue("Millibar")
    MILLIBAR("Millibar"),

    /**
     * <summary>
     *             MCU - 304 - Millicurie
     *             </summary>
     * 
     */
    @XmlEnumValue("Millicurie")
    MILLICURIE("Millicurie"),

    /**
     * <summary>
     *             MGM - 161 - Milligram
     *             </summary>
     * 
     */
    @XmlEnumValue("Milligram")
    MILLIGRAM("Milligram"),

    /**
     * <summary>
     *             MHZ - 292 - Megahertz
     *             </summary>
     * 
     */
    @XmlEnumValue("Megahertz")
    MEGAHERTZ("Megahertz"),

    /**
     * <summary>
     *             MIK - 079 - Square Mile
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareMile")
    SQUARE_MILE("SquareMile"),

    /**
     * <summary>
     *             MIL - 798 - Thousand
     *             </summary>
     * 
     */
    @XmlEnumValue("Thousand")
    THOUSAND("Thousand"),

    /**
     * <summary>
     *             MIN - 355 - Minute
     *             </summary>
     * 
     */
    @XmlEnumValue("Minute")
    MINUTE("Minute"),

    /**
     * <summary>
     *             MIO - 799 - Million
     *             </summary>
     * 
     */
    @XmlEnumValue("Million")
    MILLION("Million"),

    /**
     * <summary>
     *             MIU - 855 - Million International Unit
     *             </summary>
     * 
     */
    @XmlEnumValue("MillionInternationalUnit")
    MILLION_INTERNATIONAL_UNIT("MillionInternationalUnit"),

    /**
     * <summary>
     *             MLD - 800 - Milliard/Billion (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("MilliardBillionUS")
    MILLIARD_BILLION_US("MilliardBillionUS"),

    /**
     * <summary>
     *             MLT - 111 - Millilitre
     *             </summary>
     * 
     */
    @XmlEnumValue("Millilitre")
    MILLILITRE("Millilitre"),

    /**
     * <summary>
     *             MLT - 111 - Milliliter
     *             </summary>
     * 
     */
    @XmlEnumValue("Milliliter")
    MILLILITER("Milliliter"),

    /**
     * <summary>
     *             MMK - 050 - Square Millimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareMillimetre")
    SQUARE_MILLIMETRE("SquareMillimetre"),

    /**
     * <summary>
     *             MMK - 050 - Square Millimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareMillimeter")
    SQUARE_MILLIMETER("SquareMillimeter"),

    /**
     * <summary>
     *             MMQ - 110 - Cubic Millimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMillimetre")
    CUBIC_MILLIMETRE("CubicMillimetre"),

    /**
     * <summary>
     *             MMQ - 110 - Cubic Millimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMillimeter")
    CUBIC_MILLIMETER("CubicMillimeter"),

    /**
     * <summary>
     *             MMT - 003 - Millimetre
     *             </summary>
     * 
     */
    @XmlEnumValue("Millimetre")
    MILLIMETRE("Millimetre"),

    /**
     * <summary>
     *             MMT - 003 - Millimeter
     *             </summary>
     * 
     */
    @XmlEnumValue("Millimeter")
    MILLIMETER("Millimeter"),

    /**
     * <summary>
     *             MON - 362 - Month
     *             </summary>
     * 
     */
    @XmlEnumValue("Month")
    MONTH("Month"),

    /**
     * <summary>
     *             MPA - 298 - Megapascal
     *             </summary>
     * 
     */
    @XmlEnumValue("Megapascal")
    MEGAPASCAL("Megapascal"),

    /**
     * <summary>
     *             MQH - 598 - Cubic Metre Per Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMetrePerHour")
    CUBIC_METRE_PER_HOUR("CubicMetrePerHour"),

    /**
     * <summary>
     *             MQH - 598 - Cubic Meter Per Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMeterPerHour")
    CUBIC_METER_PER_HOUR("CubicMeterPerHour"),

    /**
     * <summary>
     *             MQS - 596 - Cubic Metre Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMetrePerSecond")
    CUBIC_METRE_PER_SECOND("CubicMetrePerSecond"),

    /**
     * <summary>
     *             MQS - 596 - Cubic Meter Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMeterPerSecond")
    CUBIC_METER_PER_SECOND("CubicMeterPerSecond"),

    /**
     * <summary>
     *             MSK - 335 - Metre Per Second Squared
     *             </summary>
     * 
     */
    @XmlEnumValue("MetrePerSecondSquared")
    METRE_PER_SECOND_SQUARED("MetrePerSecondSquared"),

    /**
     * <summary>
     *             MSK - 335 - Meter Per Second Squared
     *             </summary>
     * 
     */
    @XmlEnumValue("MeterPerSecondSquared")
    METER_PER_SECOND_SQUARED("MeterPerSecondSquared"),

    /**
     * <summary>
     *             MTK - 055 - Square Metre
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareMetre")
    SQUARE_METRE("SquareMetre"),

    /**
     * <summary>
     *             MTK - 055 - Square Meter
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareMeter")
    SQUARE_METER("SquareMeter"),

    /**
     * <summary>
     *             MTQ - 113 - Cubic Metre
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMetre")
    CUBIC_METRE("CubicMetre"),

    /**
     * <summary>
     *             MTQ - 113 - Cubic Meter
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicMeter")
    CUBIC_METER("CubicMeter"),

    /**
     * <summary>
     *             MTR - 006 - Metre
     *             </summary>
     * 
     */
    @XmlEnumValue("Metre")
    METRE("Metre"),

    /**
     * <summary>
     *             MTR - 006 - Meter
     *             </summary>
     * 
     */
    @XmlEnumValue("Meter")
    METER("Meter"),

    /**
     * <summary>
     *             MTS - 328 - Metre Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("MetrePerSecond")
    METRE_PER_SECOND("MetrePerSecond"),

    /**
     * <summary>
     *             MTS - 328 - Meter Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("MeterPerSecond")
    METER_PER_SECOND("MeterPerSecond"),

    /**
     * <summary>
     *             MVA - 228 - Megavolt - Ampere
     *             </summary>
     * 
     */
    @XmlEnumValue("MegavoltAmpere")
    MEGAVOLT_AMPERE("MegavoltAmpere"),

    /**
     * <summary>
     *             MWH - 246 - Megawatt Hour (1000 KWH)
     *             </summary>
     * 
     */
    @XmlEnumValue("MegawattHour1000KWH")
    MEGAWATT_HOUR_1000_KWH("MegawattHour1000KWH"),

    /**
     * <summary>
     *             NAR - 657 - Number Of Articles
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfArticles")
    NUMBER_OF_ARTICLES("NumberOfArticles"),

    /**
     * <summary>
     *             NBB - 616 - Number Of Bobbins
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfBobbins")
    NUMBER_OF_BOBBINS("NumberOfBobbins"),

    /**
     * <summary>
     *             NCL - 745 - Number Of Cells
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfCells")
    NUMBER_OF_CELLS("NumberOfCells"),

    /**
     * <summary>
     *             NEW - 289 - Newton
     *             </summary>
     * 
     */
    @XmlEnumValue("Newton")
    NEWTON("Newton"),

    /**
     * <summary>
     *             NIU - 851 - Number Of International Units
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfInternationalUnits")
    NUMBER_OF_INTERNATIONAL_UNITS("NumberOfInternationalUnits"),

    /**
     * <summary>
     *             NMI - 047 - Nautical Mile
     *             </summary>
     * 
     */
    @XmlEnumValue("NauticalMile")
    NAUTICAL_MILE("NauticalMile"),

    /**
     * <summary>
     *             NMP - 778 - Number Of Packs
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfPacks")
    NUMBER_OF_PACKS("NumberOfPacks"),

    /**
     * <summary>
     *             NPL - 734 - Number Of Parcels
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfParcels")
    NUMBER_OF_PARCELS("NumberOfParcels"),

    /**
     * <summary>
     *             NPR - 715 - Number Of Pairs
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfPairs")
    NUMBER_OF_PAIRS("NumberOfPairs"),

    /**
     * <summary>
     *             NPT - 735 - Number Of Parts
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfParts")
    NUMBER_OF_PARTS("NumberOfParts"),

    /**
     * <summary>
     *             NRL - 736 - Number Of Rolls
     *             </summary>
     * 
     */
    @XmlEnumValue("NumberOfRolls")
    NUMBER_OF_ROLLS("NumberOfRolls"),

    /**
     * <summary>
     *             NTT - 182 - Net Register Ton
     *             </summary>
     * 
     */
    @XmlEnumValue("NetRegisterTon")
    NET_REGISTER_TON("NetRegisterTon"),

    /**
     * <summary>
     *             OHM - 274 - Ohm
     *             </summary>
     * 
     */
    @XmlEnumValue("Ohm")
    OHM("Ohm"),

    /**
     * <summary>
     *             ONZ - 187 - Ounce
     *             </summary>
     * 
     */
    @XmlEnumValue("Ounce")
    OUNCE("Ounce"),

    /**
     * <summary>
     *             OZA - 141 - Fluid Ounce (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("FluidOunceUS")
    FLUID_OUNCE_US("FluidOunceUS"),

    /**
     * <summary>
     *             OZI - 135 - Fluid Ounce (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("FluidOunceUK")
    FLUID_OUNCE_UK("FluidOunceUK"),

    /**
     * <summary>
     *             PAL - 294 - Pascal
     *             </summary>
     * 
     */
    @XmlEnumValue("Pascal")
    PASCAL("Pascal"),

    /**
     * <summary>
     *             PCE - 796 - Piece
     *             </summary>
     * 
     */
    @XmlEnumValue("Piece")
    PIECE("Piece"),

    /**
     * <summary>
     *             PGL - 835 - Proof Gallon
     *             </summary>
     * 
     */
    @XmlEnumValue("ProofGallon")
    PROOF_GALLON("ProofGallon"),

    /**
     * <summary>
     *             PTD - 147 - Dry Pint (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("DryPintUS")
    DRY_PINT_US("DryPintUS"),

    /**
     * <summary>
     *             PTI - 137 - Pint (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("PintUK")
    PINT_UK("PintUK"),

    /**
     * <summary>
     *             PTL - 143 - Liquid Pint (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("LiquidPintUS")
    LIQUID_PINT_US("LiquidPintUS"),

    /**
     * <summary>
     *             QAN - 364 - Quarter Of A Year
     *             </summary>
     * 
     */
    @XmlEnumValue("QuarterOfAYear")
    QUARTER_OF_A_YEAR("QuarterOfAYear"),

    /**
     * <summary>
     *             QTD - 148 - Dry Quart (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("DryQuartUS")
    DRY_QUART_US("DryQuartUS"),

    /**
     * <summary>
     *             QTI - 138 - Quart (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("QuartUK")
    QUART_UK("QuartUK"),

    /**
     * <summary>
     *             QTL - 144 - Liquid Quart (US)
     *             </summary>
     * 
     */
    @XmlEnumValue("LiquidQuartUS")
    LIQUID_QUART_US("LiquidQuartUS"),

    /**
     * <summary>
     *             QTR - 191 - Quarter (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("QuarterUK")
    QUARTER_UK("QuarterUK"),

    /**
     * <summary>
     *             RPM - 331 - Revolutions Per Minute
     *             </summary>
     * 
     */
    @XmlEnumValue("RevolutionsPerMinute")
    REVOLUTIONS_PER_MINUTE("RevolutionsPerMinute"),

    /**
     * <summary>
     *             RPS - 330 - Revolutions Per Second
     *             </summary>
     * 
     */
    @XmlEnumValue("RevolutionsPerSecond")
    REVOLUTIONS_PER_SECOND("RevolutionsPerSecond"),

    /**
     * <summary>
     *             SAN - 365 - Half Year (6 Months)
     *             </summary>
     * 
     */
    @XmlEnumValue("HalfYear6Months")
    HALF_YEAR_6_MONTHS("HalfYear6Months"),

    /**
     * <summary>
     *             SCO - 730 - Score
     *             </summary>
     * 
     */
    @XmlEnumValue("Score")
    SCORE("Score"),

    /**
     * <summary>
     *             SCR - 197 - Scruple
     *             </summary>
     * 
     */
    @XmlEnumValue("Scruple")
    SCRUPLE("Scruple"),

    /**
     * <summary>
     *             SEC - 354 - Second
     *             </summary>
     * 
     */
    @XmlEnumValue("Second")
    SECOND("Second"),

    /**
     * <summary>
     *             SET - 704 - Set
     *             </summary>
     * 
     */
    @XmlEnumValue("Set")
    SET("Set"),

    /**
     * <summary>
     *             SHT - 183 - Shipping Ton
     *             </summary>
     * 
     */
    @XmlEnumValue("ShippingTon")
    SHIPPING_TON("ShippingTon"),

    /**
     * <summary>
     *             SIE - 296 - Siemens
     *             </summary>
     * 
     */
    @XmlEnumValue("Siemens")
    SIEMENS("Siemens"),

    /**
     * <summary>
     *             SMI - 045 - Mile (Statute Mile)
     *             </summary>
     * 
     */
    @XmlEnumValue("MileStatuteMile")
    MILE_STATUTE_MILE("MileStatuteMile"),

    /**
     * <summary>
     *             SST - 738 - Short Standard (7200 Matches)
     *             </summary>
     * 
     */
    @XmlEnumValue("ShortStandard7200Matches")
    SHORT_STANDARD_7200_MATCHES("ShortStandard7200Matches"),

    /**
     * <summary>
     *             STI - 190 - Stone (UK)
     *             </summary>
     * 
     */
    @XmlEnumValue("StoneUK")
    STONE_UK("StoneUK"),

    /**
     * <summary>
     *             STN - 195 - Ton (US) Or Short Ton (UK/US)
     *             </summary>
     * 
     */
    @XmlEnumValue("TonUSOrShortTonUKUS")
    TON_US_OR_SHORT_TON_UKUS("TonUSOrShortTonUKUS"),

    /**
     * <summary>
     *             TAH - 264 - Kiloampere Hour (Thousand Ampere Hour)
     *             </summary>
     * 
     */
    @XmlEnumValue("KiloampereHourThousandAmpereHour")
    KILOAMPERE_HOUR_THOUSAND_AMPERE_HOUR("KiloampereHourThousandAmpereHour"),

    /**
     * <summary>
     *             TNE - 168 - Tonne (Metric Ton)
     *             </summary>
     * 
     */
    @XmlEnumValue("TonneMetricTon")
    TONNE_METRIC_TON("TonneMetricTon"),

    /**
     * <summary>
     *             TPR - 732 - Ten Pair
     *             </summary>
     * 
     */
    @XmlEnumValue("TenPair")
    TEN_PAIR("TenPair"),

    /**
     * <summary>
     *             TQD - 599 - Thousand Cubic Metre Per Day
     *             </summary>
     * 
     */
    @XmlEnumValue("ThousandCubicMetrePerDay")
    THOUSAND_CUBIC_METRE_PER_DAY("ThousandCubicMetrePerDay"),

    /**
     * <summary>
     *             TQD - 599 - Thousand Cubic Meter Per Day
     *             </summary>
     * 
     */
    @XmlEnumValue("ThousandCubicMeterPerDay")
    THOUSAND_CUBIC_METER_PER_DAY("ThousandCubicMeterPerDay"),

    /**
     * <summary>
     *             TRL - 802 - Trillion (EUR)
     *             </summary>
     * 
     */
    @XmlEnumValue("TrillionEUR")
    TRILLION_EUR("TrillionEUR"),

    /**
     * <summary>
     *             TSD - 847 - Tonne Of Substance 90% Dry
     *             </summary>
     * 
     */
    @XmlEnumValue("TonneOfSubstance90PercentDry")
    TONNE_OF_SUBSTANCE_90_PERCENT_DRY("TonneOfSubstance90PercentDry"),

    /**
     * <summary>
     *             TSH - 533 - Ton Of Steam Per Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("TonOfSteamPerHour")
    TON_OF_STEAM_PER_HOUR("TonOfSteamPerHour"),

    /**
     * <summary>
     *             VLT - 222 - Volt
     *             </summary>
     * 
     */
    @XmlEnumValue("Volt")
    VOLT("Volt"),

    /**
     * <summary>
     *             WCD - 153 - Cord
     *             </summary>
     * 
     */
    @XmlEnumValue("Cord")
    CORD("Cord"),

    /**
     * <summary>
     *             WEB - 324 - Weber
     *             </summary>
     * 
     */
    @XmlEnumValue("Weber")
    WEBER("Weber"),

    /**
     * <summary>
     *             WEE - 360 - Week
     *             </summary>
     * 
     */
    @XmlEnumValue("Week")
    WEEK("Week"),

    /**
     * <summary>
     *             WHR - 243 - Watt Hour
     *             </summary>
     * 
     */
    @XmlEnumValue("WattHour")
    WATT_HOUR("WattHour"),

    /**
     * <summary>
     *             WSD - 152 - Standard
     *             </summary>
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard"),

    /**
     * <summary>
     *             WTT - 212 - Watt
     *             </summary>
     * 
     */
    @XmlEnumValue("Watt")
    WATT("Watt"),

    /**
     * <summary>
     *             YDK - 075 - Square Yard
     *             </summary>
     * 
     */
    @XmlEnumValue("SquareYard")
    SQUARE_YARD("SquareYard"),

    /**
     * <summary>
     *             YDQ - 133 - Cubic Yard
     *             </summary>
     * 
     */
    @XmlEnumValue("CubicYard")
    CUBIC_YARD("CubicYard"),

    /**
     * <summary>
     *             YRD - 043 - Yard
     *             </summary>
     * 
     */
    @XmlEnumValue("Yard")
    YARD("Yard");
    private final String value;

    TypeUnitOfMeasure(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeUnitOfMeasure fromValue(String v) {
        for (TypeUnitOfMeasure c: TypeUnitOfMeasure.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
