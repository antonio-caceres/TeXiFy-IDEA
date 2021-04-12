package nl.hannahsten.texifyidea.lang.commands

import nl.hannahsten.texifyidea.lang.LatexPackage
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.AMSSYMB
import nl.hannahsten.texifyidea.lang.LatexPackage.Companion.STMARYRD

/**
 * @author Hannah Schellekens
 */
enum class LatexOperatorCommand(
        override val command: String,
        override vararg val arguments: Argument = emptyArray(),
        override val dependency: LatexPackage = LatexPackage.DEFAULT,
        override val display: String? = null,
        override val isMathMode: Boolean = true,
        val collapse: Boolean = false
) : LatexCommand {

    FOR_ALL("forall", display = "∀", collapse = true),
    PARTIAL("partial", display = "∂", collapse = true),
    EXISTS("exists", display = "∃", collapse = true),
    NOT_EXISTS("nexists", dependency = AMSSYMB, display = "∄", collapse = true),
    EMPTY_SET("emptyset", display = "∅", collapse = true),
    NOTHING("varnothing", dependency = AMSSYMB, display = "∅", collapse = true),
    NABLA("nabla", display = "∇", collapse = true),
    ELEMENT_OF("in", display = "∈", collapse = true),
    NOT_ELEMENT_OF("notin", display = "∉", collapse = true),
    CONTAIN_AS_MEMBER("ni", display = "∋", collapse = true),
    COMPLEMENT("complement", dependency = AMSSYMB, display = "∁"),
    N_ARY_PRODUCT("prod", display = "∏", collapse = true),
    N_ARY_COPRODUCT("coprod", display = "∐", collapse = true),
    SUM("sum", display = "∑", collapse = true),
    MINUS_PLUS("mp", display = "∓", collapse = true),
    PLUS_MINUS("pm", display = "±", collapse = true),
    SET_MINUS("setminus", display = "∖", collapse = true),
    SMALL_SET_MINUS("smallsetminus", dependency = AMSSYMB, display = "∖", collapse = true),
    ASTERISK("ast", display = "∗"),
    STAR("star", display = "⋆", collapse = true),
    DOT_PLUS("dotplus", dependency = AMSSYMB, display = "∔"),
    CIRCLE("circ", display = "∘"),
    BULLET("bullet", display = "∙"),
    PROPORTIONAL_TO("propto", display = "∝", collapse = true),
    PROPORTIONAL_TO_SYMBOL("varpropto", dependency = AMSSYMB, display = "∝", collapse = true),
    INFINITY("infty", display = "∞", collapse = true),
    ANGLE("angle", display = "∠", collapse = true),
    MEASURED_ANGLE("measuredangle", dependency = AMSSYMB, display = "∡", collapse = true),
    SPHERICAL_ANGLE("sphericalangle", dependency = AMSSYMB, display = "∢", collapse = true),
    MID("mid", display = "∣", collapse = true),
    MID_SHORT("shortmid", dependency = AMSSYMB, display = "∣", collapse = true),
    NOT_MID_SHORT("nshortmid", dependency = AMSSYMB),
    PARALLEL("parallel", display = "∥", collapse = true),
    NOT_PARALLEL("nparallel", dependency = AMSSYMB, display = "∦", collapse = true),
    PARALLEL_SHORT("shortparallel", display = "∥", collapse = true),
    NOT_PARALLEL_SHORT("nshortparallel", dependency = AMSSYMB, display = "∦", collapse = true),
    LOGICAL_AND("land", display = "∧", collapse = true),
    LOGICAL_OR("lor", display = "∨", collapse = true),
    INTERSECTION("cap", display = "∩", collapse = true),
    UNION("cup", display = "∪", collapse = true),
    DOUBLE_UNION("Cup", dependency = AMSSYMB, display = "⋓", collapse = true),
    DOUBLE_INTERSECTION("Cap", dependency = AMSSYMB, display = "⋒", collapse = true),
    INTEGRAL("int", display = "∫", collapse = true),
    DOUBLE_INTEGRAL("iint", dependency = LatexPackage.AMSMATH, display = "∬", collapse = true),
    TRIPLE_INTEGRAL("iiint", dependency = LatexPackage.AMSMATH, display = "∭", collapse = true),
    QUADRUPLE_INTEGRAL("iiiint", dependency = LatexPackage.AMSMATH, display = "⨌", collapse = true),
    DOTS_INTEGRAL("idotsint", display = "∫⋯∫", collapse = true),
    CONTOUR_INTEGRAL("oint", display = "∮", collapse = true),
    THEREFORE("therefore", dependency = AMSSYMB, display = "∴", collapse = true),
    BECAUSE("because", dependency = AMSSYMB, display = "∵", collapse = true),
    TILDE_OPERATOR("sim", display = "∼", collapse = true),
    WREATH_PRODUCT("wr", display = "≀", collapse = true),
    APPROX("approx", display = "≈", collapse = true),
    NOT_EQUAL("neq", display = "≠", collapse = true),
    EQUIVALENT("equiv", display = "≡", collapse = true),
    LESS_THAN_EQUAL("leq", display = "≤", collapse = true),
    LESS_THAN_NOT_EQUAL("lneq", dependency = AMSSYMB, display = "⪇", collapse = true),
    LESS_THAN_EQUALL("leqq", dependency = AMSSYMB, display = "≦", collapse = true),
    GREATER_THAN_EQUAL("geq", display = "≥", collapse = true),
    GREATER_THAN_NOT_EQUAL("gneq", dependency = AMSSYMB, display = "⪈", collapse = true),
    GREATER_THAN_EQUALL("geqq", dependency = AMSSYMB, display = "≧", collapse = true),
    NOT_LESS_THAN("nless", dependency = AMSSYMB, display = "≮", collapse = true),
    NOT_GREATER_THAN("ngtr", dependency = AMSSYMB, display = "≯", collapse = true),
    NOT_LESS_THAN_EQUAL("nleq", dependency = AMSSYMB, display = "≰", collapse = true),
    NOT_LESS_THAN_EQUALL("nleqq", dependency = AMSSYMB, display = "≦\u200D\u0338"),
    NOT_GREATER_THAN_EQUAL("ngeq", dependency = AMSSYMB, display = "≱", collapse = true),
    NOT_GREATER_THAN_EQUALL("ngeqq", dependency = AMSSYMB, display = "≧\u200D\u0338"),
    DOUBLE_LESS_THAN("ll", dependency = AMSSYMB, display = "≪", collapse = true),
    LESS_LESS_LESS("lll", dependency = AMSSYMB, display = "⋘", collapse = true),
    LESS_NOT_EQUAL("lneqq", dependency = AMSSYMB, display = "≨", collapse = true),
    GREATER_NOT_EQUAL("gneqq", dependency = AMSSYMB, display = "≩", collapse = true),
    DOUBLE_GREATER_THAN("gg", dependency = AMSSYMB, display = "≫", collapse = true),
    GREATER_GREATER_GREATER("ggg", dependency = AMSSYMB, display = "⋙", collapse = true),
    SUBSET("subset", display = "⊂", collapse = true),
    SUPERSET("supset", display = "⊃", collapse = true),
    SUBSET_EQUALS("subseteq", display = "⊆", collapse = true),
    SUBSET_EQUALSS("subseteqq", dependency = AMSSYMB, display = "⊆", collapse = true),
    SUPERSET_EQUALS("supseteq", display = "⊇", collapse = true),
    SUPERSET_EQUALSS("supseteqq", dependency = AMSSYMB, display = "⊇", collapse = true),
    NOT_SUBSET_EQUALS("nsubseteq", dependency = AMSSYMB, display = "⊈", collapse = true),
    NOT_SUBSET_EQUALSS("nsubseteqq", dependency = AMSSYMB, display = "⊈", collapse = true),
    NOT_SUPERSET_EQUALS("nsupseteq", dependency = AMSSYMB, display = "⊉", collapse = true),
    NOT_SUPERSET_EQUALSS("nsupseteqq", dependency = AMSSYMB, display = "⊉", collapse = true),
    SQUARE_SUBSET("sqsubset", dependency = AMSSYMB, display = "⊏", collapse = true),
    SQUARE_SUPERSET("sqsupset", dependency = AMSSYMB, display = "⊐", collapse = true),
    SQUARE_SUBSET_EQUALS("sqsubseteq", dependency = AMSSYMB, display = "⊑", collapse = true),
    SQUARE_SUPERSET_EQUALS("sqsupseteq", dependency = AMSSYMB, display = "⊒", collapse = true),
    SQUARE_CAP("sqcap", display = "⊓", collapse = true),
    SQUARE_CUP("sqcup", display = "⊔", collapse = true),
    CIRCLED_PLUS("oplus", display = "⊕", collapse = true),
    CIRCLED_MINUS("ominus", display = "⊖", collapse = true),
    CIRCLED_TIMES("otimes", display = "⊗", collapse = true),
    CIRCLED_SLASH("oslash", display = "⊘", collapse = true),
    CIRCLED_DOT("odot", display = "⊙", collapse = true),
    BOXED_PLUS("boxplus", dependency = AMSSYMB, display = "⊞", collapse = true),
    BOXED_MINUS("boxminus", dependency = AMSSYMB, display = "⊟", collapse = true),
    BOXED_TIMES("boxtimes", dependency = AMSSYMB, display = "⊠", collapse = true),
    BOXED_DOT("boxdot", dependency = AMSSYMB, display = "⊡", collapse = true),
    BOWTIE("bowtie", display = "⋈", collapse = true),
    JOIN("Join", dependency = AMSSYMB, display = "⨝", collapse = true),
    TRIANGLE_RIGHT("triangleright", dependency = AMSSYMB, display = "▷", collapse = true),
    TRIANGLE_LEFT("triangleleft", dependency = AMSSYMB, display = "◁", collapse = true),
    LHD("lhd", dependency = AMSSYMB, display = "◁", collapse = true),
    RHD("rhd", dependency = AMSSYMB, display = "▷", collapse = true),
    UN_LHD("unlhd", dependency = AMSSYMB, display = "⊴", collapse = true),
    UN_RHD("unrhd", dependency = AMSSYMB, display = "⊵", collapse = true),
    TRIANGLELEFTEQ("tranglelefteq", dependency = AMSSYMB, display = "⊴", collapse = true),
    TRIANGLERIGHTEQ("trianglerighteq", dependency = AMSSYMB, display = "⊵", collapse = true),
    LTIMES("ltimes", dependency = AMSSYMB, display = "⋉", collapse = true),
    RTIMES("rtimes", dependency = AMSSYMB, display = "⋊", collapse = true),
    TIMES("times", display = "×", collapse = true),
    LEFT_THREE_TIMES("leftthreetimes", dependency = AMSSYMB, display = "⋋", collapse = true),
    RIGHT_THREE_TIMES("rightthreetimes", dependency = AMSSYMB, display = "⋌", collapse = true),
    CIRCLED_CIRCLE("circledcirc", dependency = AMSSYMB, display = "⊚", collapse = true),
    CIRCLED_DASH("circleddash", dependency = AMSSYMB, display = "⊝", collapse = true),
    CIRCLED_ASTERISK("circledast", dependency = AMSSYMB, display = "⊛", collapse = true),
    MULTISET_UNION("uplus", display = "⊎", collapse = true),
    WEDGE_BAR("barwedge", dependency = AMSSYMB, display = "⊼", collapse = true),
    VEE_BAR("veebar", dependency = AMSSYMB, display = "⊻", collapse = true),
    DOUBLE_BAR_WEDGE("doublebarwedge", dependency = AMSSYMB, display = "⌆", collapse = true),
    CURLY_WEDGE("curlywedge", dependency = AMSSYMB, display = "⋏", collapse = true),
    CURLY_VEE("curlyvee", dependency = AMSSYMB, display = "⋎", collapse = true),
    INTERCALATE("intercal", dependency = AMSSYMB, display = "⊺", collapse = true),
    PITCHFORK("pitchfork", dependency = AMSSYMB, display = "⋔", collapse = true),
    NOT_SIM("nsim", dependency = AMSSYMB),
    SIM_EQUALS("simeq", display = "≃", collapse = true),
    BACKWARDS_SIM_EQUALS("backsimeq", dependency = AMSSYMB, display = "⋍", collapse = true),
    APPROX_EQUALS("approxeq", dependency = AMSSYMB, display = "≊", collapse = true),
    CONG_SYMBOL("cong", dependency = AMSSYMB, display = "≅", collapse = true),
    NOT_CONG("ncong", dependency = AMSSYMB, display = "≇", collapse = true),
    SMILE("smile", dependency = AMSSYMB, display = "\u2323", collapse = true),
    FROWN("frown", dependency = AMSSYMB, display = "\u2322", collapse = true),
    SMALL_SMILE("smallsmile", dependency = AMSSYMB, display = "\u2323", collapse = true),
    SMALL_FROWN("smallfrown", dependency = AMSSYMB, display = "\u2322", collapse = true),
    BETWEEN("between", dependency = AMSSYMB, display = "≬", collapse = true),
    PRECEDES("prec", display = "≺", collapse = true),
    SUCCEEDS("succ", display = "≻", collapse = true),
    NOT_PRECEEDS("nprec", dependency = AMSSYMB, display = "⊀", collapse = true),
    NOT_SUCCEEDS("nsucc", dependency = AMSSYMB, display = "⊁", collapse = true),
    PRECEDES_OR_EQUAL("preceq", dependency = AMSSYMB, display = "⪯", collapse = true),
    SUCCEEDS_OR_EQUALS("succeq", dependency = AMSSYMB, display = "⪰", collapse = true),
    NOT_PRECEDES_OR_EQUALS("npreceq", dependency = AMSSYMB, display = "⋠", collapse = true),
    NOT_SUCCEEDS_OR_EQUALS("nsucceq", dependency = AMSSYMB, display = "⋡", collapse = true),
    CURLY_PRECEDES_OR_EQUALS("preccurlyeq", dependency = AMSSYMB, display = "≼", collapse = true),
    CURLY_SUCCEEDS_OR_EQUALS("succcurlyeq", dependency = AMSSYMB, display = "≽", collapse = true),
    CURLY_EQUALS_PRECEDES("curlyeqprec", dependency = AMSSYMB, display = "⋞", collapse = true),
    CURLY_EQUALS_SUCCEEDS("curlyeqsucc", dependency = AMSSYMB, display = "⋟", collapse = true),
    PRECEDES_SIM("precsim", dependency = AMSSYMB, display = "≾", collapse = true),
    SUCCEEDS_SIM("succsim", dependency = AMSSYMB, display = "≿", collapse = true),
    PRECEDES_NOT_SIM("precnsim", dependency = AMSSYMB, display = "⋨", collapse = true),
    SUCCEEDS_NOT_SIM("succnsim", dependency = AMSSYMB, display = "⋩", collapse = true),
    PRECEDES_APPROX("precapprox", dependency = AMSSYMB, display = "⪷", collapse = true),
    SUCCEEDS_APPROX("succapprox", dependency = AMSSYMB, display = "⪸", collapse = true),
    PRECEDES_NOT_APPROX("precnapprox", dependency = AMSSYMB, display = "⪹", collapse = true),
    SUCCEEDS_NOT_APPROX("succnapprox", dependency = AMSSYMB, display = "⪺", collapse = true),
    PERPENDICULAR("perp", display = "⟂", collapse = true),
    RIGHT_TACK("vdash", display = "⊢", collapse = true),
    NOT_RIGHT_TACK("nvdash", dependency = AMSSYMB, display = "⊬", collapse = true),
    FORCES("Vdash", dependency = AMSSYMB, display = "⊩", collapse = true),
    TRIPLE_RIGHT_TACK("Vvdash", dependency = AMSSYMB, display = "⊪", collapse = true),
    MODELS("models", display = "⊧", collapse = true),
    VERTICAL_DOUBLE_DASH_RIGHT("vDash", dependency = AMSSYMB, display = "⊨", collapse = true),
    NOT_VERTICAL_DOUBLE_DASH_RIGHT("nvDash", dependency = AMSSYMB, display = "⊭", collapse = true),
    NOT_DOUBLE_VERTICAL_DOUBLE_DASH_RIGHT("nVDash", dependency = AMSSYMB, display = "⊯", collapse = true),
    NOT_MID("nmid", dependency = AMSSYMB, display = "∤", collapse = true),
    LESS_THAN_DOT("lessdot", dependency = AMSSYMB, display = "⋖", collapse = true),
    GREATER_THAN_DOT("gtrdot", dependency = AMSSYMB, display = "⋗", collapse = true),
    LESS_THAN_VERTICAL_NOT_EQUALS("lvertneqq", dependency = AMSSYMB),
    GREATER_THAN_VERTICAL_NOT_EQUALS("gvertneqq", dependency = AMSSYMB),
    LESS_THAN_EQUALS_SLANT("leqslant", dependency = AMSSYMB, display = "⩽", collapse = true),
    GREATER_THAN_EQUALS_SLANT("geqslant", dependency = AMSSYMB, display = "⩾", collapse = true),
    NOT_LESS_THAN_EQUALS_SLANT("nleqslant", dependency = AMSSYMB),
    NOT_GREATER_THAN_EQUALS_SLANT("ngeqslant", dependency = AMSSYMB),
    EQUALS_SLANT_LESS_THAN("eqslantless", dependency = AMSSYMB, display = "⪕", collapse = true),
    EQUALS_SLANT_GREATER_THAN("eqslantgtr", dependency = AMSSYMB, display = "⪖", collapse = true),
    LESS_GREATER("lessgtr", dependency = AMSSYMB, display = "≶", collapse = true),
    GREATER_LESS("gtrless", dependency = AMSSYMB, display = "≷", collapse = true),
    LESS_EQUALS_GREATER("lesseqgtr", dependency = AMSSYMB, display = "⋚", collapse = true),
    GREATER_EQUALS_LESSER("gtreqless", dependency = AMSSYMB, display = "⋛", collapse = true),
    LESS_EQUALSS_GREATER("lesseqqgtr", dependency = AMSSYMB, display = "⪋", collapse = true),
    GREATER_EQUALSS_LESSER("gtreqqless", dependency = AMSSYMB, display = "⪌", collapse = true),
    LESS_SIM("lesssim", dependency = AMSSYMB, display = "≲", collapse = true),
    GREATER_SIM("gtrsim", dependency = AMSSYMB, display = "≳", collapse = true),
    LESS_NOT_SIM("lnsim", dependency = AMSSYMB, display = "⋦", collapse = true),
    GREATER_NOT_SIM("gnsim", dependency = AMSSYMB, display = "⋧", collapse = true),
    LESS_APPROX("lessapprox", dependency = AMSSYMB, display = "⪅", collapse = true),
    GREATER_APPROX("gtrapprox", dependency = AMSSYMB, display = "⪆", collapse = true),
    LESS_NOT_APPROX("lnapprox", dependency = AMSSYMB, display = "⪉", collapse = true),
    GREATER_NOT_APPROX("gnapprox", dependency = AMSSYMB, display = "⪊", collapse = true),
    TRIANGLE_RIGHT_VARIATION("vartriangleright", dependency = AMSSYMB, display = "⊳", collapse = true),
    TRIANGLE_LEFT_VARIATION("vartriangleleft", dependency = AMSSYMB, display = "⊲", collapse = true),
    NOT_TRIANGLE_LEFT("ntriangleleft", dependency = AMSSYMB, display = "⋪", collapse = true),
    NOT_TRIANGLE_RIGHT("ntriangleright", dependency = AMSSYMB, display = "⋫", collapse = true),
    TRIANGLE_LEFT_EQUALS("trianglelefteq", dependency = AMSSYMB, display = "⊴", collapse = true),
    TRIANGLE_RIGHT_EQUALS("trianglerighteq", dependency = AMSSYMB, display = "⊵", collapse = true),
    TRIANGLE_LEFT_EQUALS_SLANT("trianglelefteqslant", dependency = STMARYRD),
    TRIANGLE_RIGHT_EQUALS_SLANT("trianglerighteqslant", dependency = STMARYRD),
    NOT_TRIANGLE_LEFT_EQUALS("ntrianglelefteq", dependency = AMSSYMB, display = "⋬", collapse = true),
    NOT_TRIANGLE_RIGHT_EQUALS("ntrianglerighteq", dependency = AMSSYMB, display = "⋭", collapse = true),
    NOT_TRIANGLE_LEFT_EQUALS_SLANT("ntrianglelefteqslant", dependency = STMARYRD),
    NOT_TRIANGLE_RIGHT_SLANT("ntrianglerighteqslant", dependency = STMARYRD),
    BLACK_TRIANGLE_LEFT("blacktriangleleft", dependency = AMSSYMB, display = "◂", collapse = true),
    BLACK_TRIANGLE_RIGHT("blacktriangleright", dependency = AMSSYMB, display = "▸", collapse = true),
    SUBSET_NOT_EQUALS("subsetneq", dependency = AMSSYMB, display = "⊊", collapse = true),
    SUPERSET_NOT_EQUALS("supsetneq", dependency = AMSSYMB, display = "⊋", collapse = true),
    SUBSET_NOT_EQUALS_VARIATION("varsubsetneq", dependency = AMSSYMB),
    SUPERSET_NOT_EQUALS_VARIATION("varsupsetneq", dependency = AMSSYMB),
    SUBSET_NOT_EQUALSS("subsetneqq", dependency = AMSSYMB, display = "⫋", collapse = true),
    SUPERSET_NOT_EQUALSS("supsetneqq", dependency = AMSSYMB, display = "⫌", collapse = true),
    REVERSED_EPSILON("backepsilon", dependency = AMSSYMB, display = "϶", collapse = true),
    DOUBLE_SUBSET("Subset", dependency = AMSSYMB, display = "⋐", collapse = true),
    DOUBLE_SUPERSET("Supset", dependency = AMSSYMB, display = "⋑", collapse = true),
    CIRCLE_EQUALS("circeq", dependency = AMSSYMB, display = "≗", collapse = true),
    TRIANGLE_EQUALS("triangleq", dependency = AMSSYMB, display = "≜", collapse = true),
    EQUALS_CIRCLE("eqcirc", dependency = AMSSYMB),
    BUMP_EQUALS("bumpeq", dependency = AMSSYMB),
    DOUBLE_BUMP_EQUALS("Bumpeq", dependency = AMSSYMB, display = "", collapse = true),
    DOT_EQUALS_DOT("doteqdot", dependency = AMSSYMB, display = "≑", collapse = true),
    RISING_DOTS_EQUALS("risingdotseq", dependency = AMSSYMB, display = "≓", collapse = true),
    FALLING_DOTS_EQUALS("fallingdotseq", dependency = AMSSYMB, display = "≒", collapse = true),
    DOT_EQUALS("doteq", dependency = AMSSYMB),
    SUBSET_PLUS("subsetplus", dependency = STMARYRD),
    SUBSET_PLUS_EQUALS("subsetpluseq", dependency = STMARYRD),
    SUPERSET_PLUS("supsetplus", dependency = STMARYRD),
    SUPERSET_PLUS_EQUALS("supsetpluseq", dependency = STMARYRD),
    IN_PLUS("inplus", dependency = STMARYRD),
    REVERSED_IN_PLUS("niplus", dependency = STMARYRD),
    ;

    override val identifier: String
        get() = name
}