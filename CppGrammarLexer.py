# Generated from CppGrammar.g4 by ANTLR 4.13.1
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
    from typing import TextIO
else:
    from typing.io import TextIO


def serializedATN():
    return [
        4,0,84,606,6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,
        2,6,7,6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,
        13,7,13,2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,
        19,2,20,7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,2,25,7,25,2,
        26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,30,7,30,2,31,7,31,2,32,7,
        32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,7,37,2,38,7,38,2,
        39,7,39,2,40,7,40,2,41,7,41,2,42,7,42,2,43,7,43,2,44,7,44,2,45,7,
        45,2,46,7,46,2,47,7,47,2,48,7,48,2,49,7,49,2,50,7,50,2,51,7,51,2,
        52,7,52,2,53,7,53,2,54,7,54,2,55,7,55,2,56,7,56,2,57,7,57,2,58,7,
        58,2,59,7,59,2,60,7,60,2,61,7,61,2,62,7,62,2,63,7,63,2,64,7,64,2,
        65,7,65,2,66,7,66,2,67,7,67,2,68,7,68,2,69,7,69,2,70,7,70,2,71,7,
        71,2,72,7,72,2,73,7,73,2,74,7,74,2,75,7,75,2,76,7,76,2,77,7,77,2,
        78,7,78,2,79,7,79,2,80,7,80,2,81,7,81,2,82,7,82,2,83,7,83,1,0,1,
        0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,2,1,2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,4,3,4,201,8,
        4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,
        7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,9,1,9,1,9,1,
        10,1,10,1,10,1,10,1,10,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,
        11,1,12,1,12,1,12,1,12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,
        14,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,15,1,16,1,16,1,16,1,16,1,
        17,1,17,1,17,1,17,1,17,1,17,1,18,1,18,1,18,1,18,1,18,1,18,1,18,1,
        18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,20,1,20,1,20,1,
        20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,1,22,1,22,1,22,1,22,1,22,1,
        22,1,22,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,24,1,
        24,1,24,1,25,1,25,1,25,1,25,1,25,1,26,1,26,1,26,1,26,1,26,1,26,1,
        26,1,26,1,27,1,27,1,27,1,27,1,28,1,28,1,28,1,28,1,28,1,28,1,28,1,
        29,1,29,1,29,1,29,1,29,1,29,1,29,1,29,1,30,1,30,1,30,1,30,1,30,1,
        30,1,30,1,30,1,30,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,31,1,
        32,1,32,1,32,1,32,1,32,1,32,1,32,1,32,1,33,1,33,1,33,1,33,1,33,1,
        33,1,33,1,33,1,33,1,33,1,34,1,34,1,34,1,34,1,34,1,34,1,34,1,35,1,
        35,1,35,1,35,1,35,1,35,1,35,1,36,1,36,1,36,1,36,1,36,1,37,1,37,3,
        37,416,8,37,1,38,1,38,1,38,1,38,1,38,1,38,1,39,1,39,1,39,1,39,1,
        39,1,40,1,40,1,40,1,41,1,41,1,41,1,42,1,42,1,43,1,43,1,44,1,44,1,
        45,1,45,1,46,1,46,1,47,1,47,1,47,1,48,1,48,1,48,1,49,1,49,1,50,1,
        50,1,50,1,51,1,51,1,52,1,52,1,52,1,53,1,53,1,53,1,54,1,54,1,54,1,
        55,1,55,1,56,1,56,1,57,1,57,1,57,1,58,1,58,1,58,1,59,1,59,1,59,1,
        60,1,60,1,60,1,61,1,61,1,61,1,62,1,62,1,62,1,63,1,63,1,64,1,64,1,
        64,1,64,1,65,1,65,1,66,1,66,1,67,1,67,1,68,1,68,1,69,1,69,1,70,1,
        70,1,71,1,71,1,72,1,72,1,73,1,73,1,73,1,74,1,74,1,75,1,75,1,76,1,
        76,5,76,520,8,76,10,76,12,76,523,9,76,1,77,3,77,526,8,77,1,77,1,
        77,1,77,5,77,531,8,77,10,77,12,77,534,9,77,3,77,536,8,77,1,78,1,
        78,1,78,1,78,3,78,542,8,78,1,78,1,78,1,79,1,79,1,79,1,80,1,80,4,
        80,551,8,80,11,80,12,80,552,1,80,4,80,556,8,80,11,80,12,80,557,1,
        80,1,80,4,80,562,8,80,11,80,12,80,563,1,80,1,80,4,80,568,8,80,11,
        80,12,80,569,3,80,572,8,80,1,80,1,80,3,80,576,8,80,1,80,4,80,579,
        8,80,11,80,12,80,580,3,80,583,8,80,1,81,1,81,1,81,1,81,1,81,3,81,
        590,8,81,1,82,1,82,4,82,594,8,82,11,82,12,82,595,1,82,1,82,1,83,
        4,83,601,8,83,11,83,12,83,602,1,83,1,83,0,0,84,1,1,3,2,5,3,7,4,9,
        5,11,6,13,7,15,8,17,9,19,10,21,11,23,12,25,13,27,14,29,15,31,16,
        33,17,35,18,37,19,39,20,41,21,43,22,45,23,47,24,49,25,51,26,53,27,
        55,28,57,29,59,30,61,31,63,32,65,33,67,34,69,35,71,36,73,37,75,38,
        77,39,79,40,81,41,83,42,85,43,87,44,89,45,91,46,93,47,95,48,97,49,
        99,50,101,51,103,52,105,53,107,54,109,55,111,56,113,57,115,58,117,
        59,119,60,121,61,123,62,125,63,127,64,129,65,131,66,133,67,135,68,
        137,69,139,70,141,71,143,72,145,73,147,74,149,75,151,76,153,77,155,
        78,157,79,159,80,161,81,163,82,165,83,167,84,1,0,12,3,0,65,90,95,
        95,97,122,4,0,48,57,65,90,95,95,97,122,1,0,49,57,1,0,48,57,3,0,10,
        10,13,13,39,39,2,0,70,70,102,102,2,0,69,69,101,101,2,0,43,43,45,
        45,2,0,34,34,60,60,7,0,9,10,12,13,32,32,34,34,39,39,60,60,62,62,
        2,0,34,34,62,62,3,0,9,10,12,13,32,32,627,0,1,1,0,0,0,0,3,1,0,0,0,
        0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,1,0,0,0,0,
        15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,0,0,
        25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,
        35,1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,
        45,1,0,0,0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,
        55,1,0,0,0,0,57,1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,
        65,1,0,0,0,0,67,1,0,0,0,0,69,1,0,0,0,0,71,1,0,0,0,0,73,1,0,0,0,0,
        75,1,0,0,0,0,77,1,0,0,0,0,79,1,0,0,0,0,81,1,0,0,0,0,83,1,0,0,0,0,
        85,1,0,0,0,0,87,1,0,0,0,0,89,1,0,0,0,0,91,1,0,0,0,0,93,1,0,0,0,0,
        95,1,0,0,0,0,97,1,0,0,0,0,99,1,0,0,0,0,101,1,0,0,0,0,103,1,0,0,0,
        0,105,1,0,0,0,0,107,1,0,0,0,0,109,1,0,0,0,0,111,1,0,0,0,0,113,1,
        0,0,0,0,115,1,0,0,0,0,117,1,0,0,0,0,119,1,0,0,0,0,121,1,0,0,0,0,
        123,1,0,0,0,0,125,1,0,0,0,0,127,1,0,0,0,0,129,1,0,0,0,0,131,1,0,
        0,0,0,133,1,0,0,0,0,135,1,0,0,0,0,137,1,0,0,0,0,139,1,0,0,0,0,141,
        1,0,0,0,0,143,1,0,0,0,0,145,1,0,0,0,0,147,1,0,0,0,0,149,1,0,0,0,
        0,151,1,0,0,0,0,153,1,0,0,0,0,155,1,0,0,0,0,157,1,0,0,0,0,159,1,
        0,0,0,0,161,1,0,0,0,0,163,1,0,0,0,0,165,1,0,0,0,0,167,1,0,0,0,1,
        169,1,0,0,0,3,178,1,0,0,0,5,188,1,0,0,0,7,193,1,0,0,0,9,200,1,0,
        0,0,11,206,1,0,0,0,13,210,1,0,0,0,15,215,1,0,0,0,17,221,1,0,0,0,
        19,228,1,0,0,0,21,233,1,0,0,0,23,238,1,0,0,0,25,247,1,0,0,0,27,252,
        1,0,0,0,29,255,1,0,0,0,31,260,1,0,0,0,33,268,1,0,0,0,35,272,1,0,
        0,0,37,278,1,0,0,0,39,287,1,0,0,0,41,293,1,0,0,0,43,300,1,0,0,0,
        45,306,1,0,0,0,47,313,1,0,0,0,49,320,1,0,0,0,51,326,1,0,0,0,53,331,
        1,0,0,0,55,339,1,0,0,0,57,343,1,0,0,0,59,350,1,0,0,0,61,358,1,0,
        0,0,63,367,1,0,0,0,65,376,1,0,0,0,67,384,1,0,0,0,69,394,1,0,0,0,
        71,401,1,0,0,0,73,408,1,0,0,0,75,415,1,0,0,0,77,417,1,0,0,0,79,423,
        1,0,0,0,81,428,1,0,0,0,83,431,1,0,0,0,85,434,1,0,0,0,87,436,1,0,
        0,0,89,438,1,0,0,0,91,440,1,0,0,0,93,442,1,0,0,0,95,444,1,0,0,0,
        97,447,1,0,0,0,99,450,1,0,0,0,101,452,1,0,0,0,103,455,1,0,0,0,105,
        457,1,0,0,0,107,460,1,0,0,0,109,463,1,0,0,0,111,466,1,0,0,0,113,
        468,1,0,0,0,115,470,1,0,0,0,117,473,1,0,0,0,119,476,1,0,0,0,121,
        479,1,0,0,0,123,482,1,0,0,0,125,485,1,0,0,0,127,488,1,0,0,0,129,
        490,1,0,0,0,131,494,1,0,0,0,133,496,1,0,0,0,135,498,1,0,0,0,137,
        500,1,0,0,0,139,502,1,0,0,0,141,504,1,0,0,0,143,506,1,0,0,0,145,
        508,1,0,0,0,147,510,1,0,0,0,149,513,1,0,0,0,151,515,1,0,0,0,153,
        517,1,0,0,0,155,525,1,0,0,0,157,537,1,0,0,0,159,545,1,0,0,0,161,
        571,1,0,0,0,163,589,1,0,0,0,165,591,1,0,0,0,167,600,1,0,0,0,169,
        170,5,35,0,0,170,171,5,105,0,0,171,172,5,110,0,0,172,173,5,99,0,
        0,173,174,5,108,0,0,174,175,5,117,0,0,175,176,5,100,0,0,176,177,
        5,101,0,0,177,2,1,0,0,0,178,179,5,110,0,0,179,180,5,97,0,0,180,181,
        5,109,0,0,181,182,5,101,0,0,182,183,5,115,0,0,183,184,5,112,0,0,
        184,185,5,97,0,0,185,186,5,99,0,0,186,187,5,101,0,0,187,4,1,0,0,
        0,188,189,5,99,0,0,189,190,5,104,0,0,190,191,5,97,0,0,191,192,5,
        114,0,0,192,6,1,0,0,0,193,194,5,115,0,0,194,195,5,104,0,0,195,196,
        5,111,0,0,196,197,5,114,0,0,197,198,5,116,0,0,198,8,1,0,0,0,199,
        201,3,23,11,0,200,199,1,0,0,0,200,201,1,0,0,0,201,202,1,0,0,0,202,
        203,3,13,6,0,203,204,6,4,0,0,204,205,3,11,5,0,205,10,1,0,0,0,206,
        207,5,105,0,0,207,208,5,110,0,0,208,209,5,116,0,0,209,12,1,0,0,0,
        210,211,5,108,0,0,211,212,5,111,0,0,212,213,5,110,0,0,213,214,5,
        103,0,0,214,14,1,0,0,0,215,216,5,102,0,0,216,217,5,108,0,0,217,218,
        5,111,0,0,218,219,5,97,0,0,219,220,5,116,0,0,220,16,1,0,0,0,221,
        222,5,100,0,0,222,223,5,111,0,0,223,224,5,117,0,0,224,225,5,98,0,
        0,225,226,5,108,0,0,226,227,5,101,0,0,227,18,1,0,0,0,228,229,5,118,
        0,0,229,230,5,111,0,0,230,231,5,105,0,0,231,232,5,100,0,0,232,20,
        1,0,0,0,233,234,5,98,0,0,234,235,5,111,0,0,235,236,5,111,0,0,236,
        237,5,108,0,0,237,22,1,0,0,0,238,239,5,117,0,0,239,240,5,110,0,0,
        240,241,5,115,0,0,241,242,5,105,0,0,242,243,5,103,0,0,243,244,5,
        110,0,0,244,245,5,101,0,0,245,246,5,100,0,0,246,24,1,0,0,0,247,248,
        5,97,0,0,248,249,5,117,0,0,249,250,5,116,0,0,250,251,5,111,0,0,251,
        26,1,0,0,0,252,253,5,105,0,0,253,254,5,102,0,0,254,28,1,0,0,0,255,
        256,5,101,0,0,256,257,5,108,0,0,257,258,5,115,0,0,258,259,5,101,
        0,0,259,30,1,0,0,0,260,261,5,101,0,0,261,262,5,108,0,0,262,263,5,
        115,0,0,263,264,5,101,0,0,264,265,5,32,0,0,265,266,5,105,0,0,266,
        267,5,102,0,0,267,32,1,0,0,0,268,269,5,102,0,0,269,270,5,111,0,0,
        270,271,5,114,0,0,271,34,1,0,0,0,272,273,5,119,0,0,273,274,5,104,
        0,0,274,275,5,105,0,0,275,276,5,108,0,0,276,277,5,101,0,0,277,36,
        1,0,0,0,278,279,5,99,0,0,279,280,5,111,0,0,280,281,5,110,0,0,281,
        282,5,116,0,0,282,283,5,105,0,0,283,284,5,110,0,0,284,285,5,117,
        0,0,285,286,5,101,0,0,286,38,1,0,0,0,287,288,5,98,0,0,288,289,5,
        114,0,0,289,290,5,101,0,0,290,291,5,97,0,0,291,292,5,107,0,0,292,
        40,1,0,0,0,293,294,5,114,0,0,294,295,5,101,0,0,295,296,5,116,0,0,
        296,297,5,117,0,0,297,298,5,114,0,0,298,299,5,110,0,0,299,42,1,0,
        0,0,300,301,5,99,0,0,301,302,5,111,0,0,302,303,5,110,0,0,303,304,
        5,115,0,0,304,305,5,116,0,0,305,44,1,0,0,0,306,307,5,115,0,0,307,
        308,5,116,0,0,308,309,5,97,0,0,309,310,5,116,0,0,310,311,5,105,0,
        0,311,312,5,99,0,0,312,46,1,0,0,0,313,314,5,115,0,0,314,315,5,116,
        0,0,315,316,5,114,0,0,316,317,5,117,0,0,317,318,5,99,0,0,318,319,
        5,116,0,0,319,48,1,0,0,0,320,321,5,99,0,0,321,322,5,108,0,0,322,
        323,5,97,0,0,323,324,5,115,0,0,324,325,5,115,0,0,325,50,1,0,0,0,
        326,327,5,101,0,0,327,328,5,110,0,0,328,329,5,117,0,0,329,330,5,
        109,0,0,330,52,1,0,0,0,331,332,5,118,0,0,332,333,5,105,0,0,333,334,
        5,114,0,0,334,335,5,116,0,0,335,336,5,117,0,0,336,337,5,97,0,0,337,
        338,5,108,0,0,338,54,1,0,0,0,339,340,5,110,0,0,340,341,5,101,0,0,
        341,342,5,119,0,0,342,56,1,0,0,0,343,344,5,100,0,0,344,345,5,101,
        0,0,345,346,5,108,0,0,346,347,5,101,0,0,347,348,5,116,0,0,348,349,
        5,101,0,0,349,58,1,0,0,0,350,351,5,110,0,0,351,352,5,117,0,0,352,
        353,5,108,0,0,353,354,5,108,0,0,354,355,5,112,0,0,355,356,5,116,
        0,0,356,357,5,114,0,0,357,60,1,0,0,0,358,359,5,111,0,0,359,360,5,
        112,0,0,360,361,5,101,0,0,361,362,5,114,0,0,362,363,5,97,0,0,363,
        364,5,116,0,0,364,365,5,111,0,0,365,366,5,114,0,0,366,62,1,0,0,0,
        367,368,5,111,0,0,368,369,5,118,0,0,369,370,5,101,0,0,370,371,5,
        114,0,0,371,372,5,114,0,0,372,373,5,105,0,0,373,374,5,100,0,0,374,
        375,5,101,0,0,375,64,1,0,0,0,376,377,5,112,0,0,377,378,5,114,0,0,
        378,379,5,105,0,0,379,380,5,118,0,0,380,381,5,97,0,0,381,382,5,116,
        0,0,382,383,5,101,0,0,383,66,1,0,0,0,384,385,5,112,0,0,385,386,5,
        114,0,0,386,387,5,111,0,0,387,388,5,116,0,0,388,389,5,101,0,0,389,
        390,5,99,0,0,390,391,5,116,0,0,391,392,5,101,0,0,392,393,5,100,0,
        0,393,68,1,0,0,0,394,395,5,112,0,0,395,396,5,117,0,0,396,397,5,98,
        0,0,397,398,5,108,0,0,398,399,5,105,0,0,399,400,5,99,0,0,400,70,
        1,0,0,0,401,402,5,115,0,0,402,403,5,105,0,0,403,404,5,122,0,0,404,
        405,5,101,0,0,405,406,5,111,0,0,406,407,5,102,0,0,407,72,1,0,0,0,
        408,409,5,116,0,0,409,410,5,104,0,0,410,411,5,105,0,0,411,412,5,
        115,0,0,412,74,1,0,0,0,413,416,3,77,38,0,414,416,3,79,39,0,415,413,
        1,0,0,0,415,414,1,0,0,0,416,76,1,0,0,0,417,418,5,102,0,0,418,419,
        5,97,0,0,419,420,5,108,0,0,420,421,5,115,0,0,421,422,5,101,0,0,422,
        78,1,0,0,0,423,424,5,116,0,0,424,425,5,114,0,0,425,426,5,117,0,0,
        426,427,5,101,0,0,427,80,1,0,0,0,428,429,5,43,0,0,429,430,5,43,0,
        0,430,82,1,0,0,0,431,432,5,45,0,0,432,433,5,45,0,0,433,84,1,0,0,
        0,434,435,5,43,0,0,435,86,1,0,0,0,436,437,5,45,0,0,437,88,1,0,0,
        0,438,439,5,42,0,0,439,90,1,0,0,0,440,441,5,47,0,0,441,92,1,0,0,
        0,442,443,5,37,0,0,443,94,1,0,0,0,444,445,5,61,0,0,445,446,5,61,
        0,0,446,96,1,0,0,0,447,448,5,33,0,0,448,449,5,61,0,0,449,98,1,0,
        0,0,450,451,5,62,0,0,451,100,1,0,0,0,452,453,5,62,0,0,453,454,5,
        61,0,0,454,102,1,0,0,0,455,456,5,60,0,0,456,104,1,0,0,0,457,458,
        5,60,0,0,458,459,5,61,0,0,459,106,1,0,0,0,460,461,5,38,0,0,461,462,
        5,38,0,0,462,108,1,0,0,0,463,464,5,124,0,0,464,465,5,124,0,0,465,
        110,1,0,0,0,466,467,5,33,0,0,467,112,1,0,0,0,468,469,5,61,0,0,469,
        114,1,0,0,0,470,471,5,43,0,0,471,472,5,61,0,0,472,116,1,0,0,0,473,
        474,5,45,0,0,474,475,5,61,0,0,475,118,1,0,0,0,476,477,5,42,0,0,477,
        478,5,61,0,0,478,120,1,0,0,0,479,480,5,47,0,0,480,481,5,61,0,0,481,
        122,1,0,0,0,482,483,5,37,0,0,483,484,5,61,0,0,484,124,1,0,0,0,485,
        486,5,45,0,0,486,487,5,62,0,0,487,126,1,0,0,0,488,489,5,63,0,0,489,
        128,1,0,0,0,490,491,5,46,0,0,491,492,5,46,0,0,492,493,5,46,0,0,493,
        130,1,0,0,0,494,495,5,59,0,0,495,132,1,0,0,0,496,497,5,58,0,0,497,
        134,1,0,0,0,498,499,5,40,0,0,499,136,1,0,0,0,500,501,5,41,0,0,501,
        138,1,0,0,0,502,503,5,91,0,0,503,140,1,0,0,0,504,505,5,93,0,0,505,
        142,1,0,0,0,506,507,5,123,0,0,507,144,1,0,0,0,508,509,5,125,0,0,
        509,146,1,0,0,0,510,511,5,58,0,0,511,512,5,58,0,0,512,148,1,0,0,
        0,513,514,5,46,0,0,514,150,1,0,0,0,515,516,5,44,0,0,516,152,1,0,
        0,0,517,521,7,0,0,0,518,520,7,1,0,0,519,518,1,0,0,0,520,523,1,0,
        0,0,521,519,1,0,0,0,521,522,1,0,0,0,522,154,1,0,0,0,523,521,1,0,
        0,0,524,526,5,45,0,0,525,524,1,0,0,0,525,526,1,0,0,0,526,535,1,0,
        0,0,527,536,5,48,0,0,528,532,7,2,0,0,529,531,7,3,0,0,530,529,1,0,
        0,0,531,534,1,0,0,0,532,530,1,0,0,0,532,533,1,0,0,0,533,536,1,0,
        0,0,534,532,1,0,0,0,535,527,1,0,0,0,535,528,1,0,0,0,536,156,1,0,
        0,0,537,541,5,39,0,0,538,542,8,4,0,0,539,540,5,92,0,0,540,542,5,
        39,0,0,541,538,1,0,0,0,541,539,1,0,0,0,542,543,1,0,0,0,543,544,5,
        39,0,0,544,158,1,0,0,0,545,546,3,161,80,0,546,547,7,5,0,0,547,160,
        1,0,0,0,548,550,5,46,0,0,549,551,7,3,0,0,550,549,1,0,0,0,551,552,
        1,0,0,0,552,550,1,0,0,0,552,553,1,0,0,0,553,572,1,0,0,0,554,556,
        7,3,0,0,555,554,1,0,0,0,556,557,1,0,0,0,557,555,1,0,0,0,557,558,
        1,0,0,0,558,559,1,0,0,0,559,572,5,46,0,0,560,562,7,3,0,0,561,560,
        1,0,0,0,562,563,1,0,0,0,563,561,1,0,0,0,563,564,1,0,0,0,564,565,
        1,0,0,0,565,567,5,46,0,0,566,568,7,3,0,0,567,566,1,0,0,0,568,569,
        1,0,0,0,569,567,1,0,0,0,569,570,1,0,0,0,570,572,1,0,0,0,571,548,
        1,0,0,0,571,555,1,0,0,0,571,561,1,0,0,0,572,582,1,0,0,0,573,575,
        7,6,0,0,574,576,7,7,0,0,575,574,1,0,0,0,575,576,1,0,0,0,576,578,
        1,0,0,0,577,579,7,3,0,0,578,577,1,0,0,0,579,580,1,0,0,0,580,578,
        1,0,0,0,580,581,1,0,0,0,581,583,1,0,0,0,582,573,1,0,0,0,582,583,
        1,0,0,0,583,162,1,0,0,0,584,590,3,155,77,0,585,590,3,157,78,0,586,
        590,3,161,80,0,587,590,3,159,79,0,588,590,3,75,37,0,589,584,1,0,
        0,0,589,585,1,0,0,0,589,586,1,0,0,0,589,587,1,0,0,0,589,588,1,0,
        0,0,590,164,1,0,0,0,591,593,7,8,0,0,592,594,8,9,0,0,593,592,1,0,
        0,0,594,595,1,0,0,0,595,593,1,0,0,0,595,596,1,0,0,0,596,597,1,0,
        0,0,597,598,7,10,0,0,598,166,1,0,0,0,599,601,7,11,0,0,600,599,1,
        0,0,0,601,602,1,0,0,0,602,600,1,0,0,0,602,603,1,0,0,0,603,604,1,
        0,0,0,604,605,6,83,1,0,605,168,1,0,0,0,19,0,200,415,521,525,532,
        535,541,552,557,563,569,571,575,580,582,589,595,602,2,1,4,0,6,0,
        0
    ]

class CppGrammarLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    INCLUDE = 1
    NAMESPACE = 2
    CHAR = 3
    SHORT = 4
    INT_TYPE = 5
    INT = 6
    LONG = 7
    FLOAT = 8
    DOUBLE = 9
    VOID = 10
    BOOL = 11
    UNSIGNED = 12
    AUTO = 13
    IF = 14
    ELSE = 15
    ELSE_IF = 16
    FOR = 17
    WHILE = 18
    CONTINUE = 19
    BREAK = 20
    RETURN = 21
    CONST = 22
    STATIC = 23
    STRUCT = 24
    CLASS = 25
    ENUM = 26
    VIRTUAL = 27
    NEW = 28
    DELETE = 29
    NULLPTR = 30
    OPERATOR = 31
    OVERRIDE = 32
    PRIVATE = 33
    PROTECTED = 34
    PUBLIC = 35
    SIZEOF = 36
    THIS = 37
    BOOL_LITERAL = 38
    FALSE = 39
    TRUE = 40
    INCREMENT = 41
    DECREMENT = 42
    ADD = 43
    SUBSTRACT = 44
    MULTIPLY = 45
    DIVIDE = 46
    MODULO = 47
    EQUAL = 48
    NONEQUAL = 49
    GREATER = 50
    GREATER_EQUAL = 51
    LESSER = 52
    LESSER_EQUAL = 53
    LOG_AND = 54
    LOG_OR = 55
    LOG_NOT = 56
    ASSIGN = 57
    ASSIGN_ADD = 58
    ASSIGN_SUBSTRACT = 59
    ASSIGN_MULTIPLY = 60
    ASSIGN_DIVIDE = 61
    ASSIGN_MODULO = 62
    ARROW = 63
    QUESTION_MARK = 64
    ELLIPSIS = 65
    SEMICOLON = 66
    COLON = 67
    LEFT_PARENTHESIS = 68
    RIGHT_PARENTHESIS = 69
    LEFT_SQUARE = 70
    RIGHT_SQUARE = 71
    LEFT_BRACKET = 72
    RIGHT_BRACKET = 73
    SCOPE_RESOLUTION = 74
    DOT = 75
    COMMA = 76
    ID = 77
    INT_LITERAL = 78
    CHAR_LITERAL = 79
    FLOAT_LITERAL = 80
    DOUBLE_LITERAL = 81
    ANY_LITERAL = 82
    INCLUDELITERAL = 83
    Whitespace = 84

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'#include'", "'namespace'", "'char'", "'short'", "'int'", "'long'", 
            "'float'", "'double'", "'void'", "'bool'", "'unsigned'", "'auto'", 
            "'if'", "'else'", "'else if'", "'for'", "'while'", "'continue'", 
            "'break'", "'return'", "'const'", "'static'", "'struct'", "'class'", 
            "'enum'", "'virtual'", "'new'", "'delete'", "'nullptr'", "'operator'", 
            "'override'", "'private'", "'protected'", "'public'", "'sizeof'", 
            "'this'", "'false'", "'true'", "'++'", "'--'", "'+'", "'-'", 
            "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'>='", "'<'", "'<='", 
            "'&&'", "'||'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
            "'%='", "'->'", "'?'", "'...'", "';'", "':'", "'('", "')'", 
            "'['", "']'", "'{'", "'}'", "'::'", "'.'", "','" ]

    symbolicNames = [ "<INVALID>",
            "INCLUDE", "NAMESPACE", "CHAR", "SHORT", "INT_TYPE", "INT", 
            "LONG", "FLOAT", "DOUBLE", "VOID", "BOOL", "UNSIGNED", "AUTO", 
            "IF", "ELSE", "ELSE_IF", "FOR", "WHILE", "CONTINUE", "BREAK", 
            "RETURN", "CONST", "STATIC", "STRUCT", "CLASS", "ENUM", "VIRTUAL", 
            "NEW", "DELETE", "NULLPTR", "OPERATOR", "OVERRIDE", "PRIVATE", 
            "PROTECTED", "PUBLIC", "SIZEOF", "THIS", "BOOL_LITERAL", "FALSE", 
            "TRUE", "INCREMENT", "DECREMENT", "ADD", "SUBSTRACT", "MULTIPLY", 
            "DIVIDE", "MODULO", "EQUAL", "NONEQUAL", "GREATER", "GREATER_EQUAL", 
            "LESSER", "LESSER_EQUAL", "LOG_AND", "LOG_OR", "LOG_NOT", "ASSIGN", 
            "ASSIGN_ADD", "ASSIGN_SUBSTRACT", "ASSIGN_MULTIPLY", "ASSIGN_DIVIDE", 
            "ASSIGN_MODULO", "ARROW", "QUESTION_MARK", "ELLIPSIS", "SEMICOLON", 
            "COLON", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_SQUARE", 
            "RIGHT_SQUARE", "LEFT_BRACKET", "RIGHT_BRACKET", "SCOPE_RESOLUTION", 
            "DOT", "COMMA", "ID", "INT_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", 
            "DOUBLE_LITERAL", "ANY_LITERAL", "INCLUDELITERAL", "Whitespace" ]

    ruleNames = [ "INCLUDE", "NAMESPACE", "CHAR", "SHORT", "INT_TYPE", "INT", 
                  "LONG", "FLOAT", "DOUBLE", "VOID", "BOOL", "UNSIGNED", 
                  "AUTO", "IF", "ELSE", "ELSE_IF", "FOR", "WHILE", "CONTINUE", 
                  "BREAK", "RETURN", "CONST", "STATIC", "STRUCT", "CLASS", 
                  "ENUM", "VIRTUAL", "NEW", "DELETE", "NULLPTR", "OPERATOR", 
                  "OVERRIDE", "PRIVATE", "PROTECTED", "PUBLIC", "SIZEOF", 
                  "THIS", "BOOL_LITERAL", "FALSE", "TRUE", "INCREMENT", 
                  "DECREMENT", "ADD", "SUBSTRACT", "MULTIPLY", "DIVIDE", 
                  "MODULO", "EQUAL", "NONEQUAL", "GREATER", "GREATER_EQUAL", 
                  "LESSER", "LESSER_EQUAL", "LOG_AND", "LOG_OR", "LOG_NOT", 
                  "ASSIGN", "ASSIGN_ADD", "ASSIGN_SUBSTRACT", "ASSIGN_MULTIPLY", 
                  "ASSIGN_DIVIDE", "ASSIGN_MODULO", "ARROW", "QUESTION_MARK", 
                  "ELLIPSIS", "SEMICOLON", "COLON", "LEFT_PARENTHESIS", 
                  "RIGHT_PARENTHESIS", "LEFT_SQUARE", "RIGHT_SQUARE", "LEFT_BRACKET", 
                  "RIGHT_BRACKET", "SCOPE_RESOLUTION", "DOT", "COMMA", "ID", 
                  "INT_LITERAL", "CHAR_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
                  "ANY_LITERAL", "INCLUDELITERAL", "Whitespace" ]

    grammarFileName = "CppGrammar.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


    def action(self, localctx:RuleContext, ruleIndex:int, actionIndex:int):
        if self._actions is None:
            actions = dict()
            actions[4] = self.INT_TYPE_action 
            self._actions = actions
        action = self._actions.get(ruleIndex, None)
        if action is not None:
            action(localctx, actionIndex)
        else:
            raise Exception("No registered action for:" + str(ruleIndex))


    def INT_TYPE_action(self, localctx:RuleContext , actionIndex:int):
        if actionIndex == 0:
            0,2
     

