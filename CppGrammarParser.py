# Generated from CppGrammar.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,84,597,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,1,0,1,0,4,0,53,8,0,
        11,0,12,0,54,1,1,1,1,1,1,1,2,1,2,1,2,1,2,3,2,64,8,2,1,3,1,3,1,3,
        1,3,3,3,70,8,3,1,3,1,3,1,3,3,3,75,8,3,1,3,5,3,78,8,3,10,3,12,3,81,
        9,3,3,3,83,8,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,3,4,92,8,4,1,4,1,4,1,
        4,3,4,97,8,4,5,4,99,8,4,10,4,12,4,102,9,4,1,5,1,5,1,5,1,5,1,5,5,
        5,109,8,5,10,5,12,5,112,9,5,3,5,114,8,5,1,5,1,5,1,5,1,5,1,5,1,6,
        1,6,1,6,1,6,5,6,125,8,6,10,6,12,6,128,9,6,1,6,5,6,131,8,6,10,6,12,
        6,134,9,6,1,6,5,6,137,8,6,10,6,12,6,140,9,6,1,6,5,6,143,8,6,10,6,
        12,6,146,9,6,1,6,1,6,1,6,1,7,1,7,3,7,153,8,7,1,7,1,7,1,7,1,7,1,7,
        3,7,160,8,7,1,7,1,7,1,7,1,7,3,7,166,8,7,5,7,168,8,7,10,7,12,7,171,
        9,7,3,7,173,8,7,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,
        3,9,187,8,9,1,9,1,9,3,9,191,8,9,1,9,1,9,3,9,195,8,9,1,9,1,9,3,9,
        199,8,9,5,9,201,8,9,10,9,12,9,204,9,9,1,10,1,10,1,10,1,11,3,11,210,
        8,11,1,11,3,11,213,8,11,1,11,3,11,216,8,11,1,11,1,11,1,11,1,11,1,
        11,3,11,223,8,11,1,11,3,11,226,8,11,3,11,228,8,11,1,11,3,11,231,
        8,11,1,11,1,11,1,11,1,11,1,11,3,11,238,8,11,1,11,3,11,241,8,11,3,
        11,243,8,11,1,11,3,11,246,8,11,1,11,1,11,3,11,250,8,11,1,11,1,11,
        1,11,1,11,3,11,256,8,11,1,11,3,11,259,8,11,3,11,261,8,11,1,11,3,
        11,264,8,11,1,11,3,11,267,8,11,1,11,3,11,270,8,11,1,11,1,11,1,11,
        1,11,1,11,3,11,277,8,11,1,11,3,11,280,8,11,3,11,282,8,11,1,11,1,
        11,1,11,1,11,1,11,3,11,289,8,11,1,11,3,11,292,8,11,3,11,294,8,11,
        1,11,1,11,1,11,1,11,1,11,3,11,301,8,11,1,11,3,11,304,8,11,3,11,306,
        8,11,1,11,1,11,1,11,1,11,1,11,3,11,313,8,11,1,11,3,11,316,8,11,3,
        11,318,8,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,1,11,3,11,329,
        8,11,1,11,3,11,332,8,11,3,11,334,8,11,1,12,1,12,1,12,3,12,339,8,
        12,1,12,1,12,1,12,3,12,344,8,12,1,12,1,12,1,13,3,13,349,8,13,1,13,
        3,13,352,8,13,1,13,1,13,3,13,356,8,13,1,13,1,13,3,13,360,8,13,1,
        13,1,13,3,13,364,8,13,1,13,1,13,3,13,368,8,13,1,13,1,13,1,13,1,13,
        3,13,374,8,13,1,13,1,13,1,13,1,13,1,13,5,13,381,8,13,10,13,12,13,
        384,9,13,3,13,386,8,13,1,13,1,13,1,13,1,13,1,13,1,14,1,14,1,14,1,
        14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,1,14,5,14,405,8,14,10,14,12,
        14,408,9,14,1,14,1,14,3,14,412,8,14,1,14,1,14,3,14,416,8,14,1,14,
        3,14,419,8,14,1,15,3,15,422,8,15,1,15,1,15,1,15,3,15,427,8,15,1,
        15,1,15,3,15,431,8,15,1,15,1,15,1,15,3,15,436,8,15,5,15,438,8,15,
        10,15,12,15,441,9,15,1,15,1,15,1,16,1,16,1,16,1,16,1,16,1,16,3,16,
        451,8,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,16,1,17,1,17,1,17,
        1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,1,17,3,17,
        476,8,17,1,17,1,17,3,17,480,8,17,1,17,3,17,483,8,17,1,17,3,17,486,
        8,17,5,17,488,8,17,10,17,12,17,491,9,17,1,18,1,18,1,18,1,18,1,18,
        1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,19,3,19,507,8,19,1,19,
        1,19,1,19,1,19,1,19,1,19,1,19,3,19,516,8,19,5,19,518,8,19,10,19,
        12,19,521,9,19,1,20,3,20,524,8,20,1,20,1,20,3,20,528,8,20,1,20,1,
        20,3,20,532,8,20,1,20,1,20,3,20,536,8,20,3,20,538,8,20,1,21,1,21,
        1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,
        5,21,555,8,21,10,21,12,21,558,9,21,1,21,1,21,1,21,1,21,1,21,3,21,
        565,8,21,1,22,1,22,1,22,1,22,5,22,571,8,22,10,22,12,22,574,9,22,
        1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,3,23,587,
        8,23,1,24,3,24,590,8,24,1,24,1,24,1,24,3,24,595,8,24,1,24,0,0,25,
        0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,
        46,48,0,4,1,0,33,35,2,0,38,38,78,81,1,0,54,55,1,0,48,53,715,0,52,
        1,0,0,0,2,56,1,0,0,0,4,63,1,0,0,0,6,65,1,0,0,0,8,100,1,0,0,0,10,
        103,1,0,0,0,12,120,1,0,0,0,14,150,1,0,0,0,16,177,1,0,0,0,18,186,
        1,0,0,0,20,205,1,0,0,0,22,209,1,0,0,0,24,335,1,0,0,0,26,348,1,0,
        0,0,28,406,1,0,0,0,30,421,1,0,0,0,32,444,1,0,0,0,34,489,1,0,0,0,
        36,492,1,0,0,0,38,506,1,0,0,0,40,527,1,0,0,0,42,539,1,0,0,0,44,566,
        1,0,0,0,46,575,1,0,0,0,48,594,1,0,0,0,50,53,3,2,1,0,51,53,3,4,2,
        0,52,50,1,0,0,0,52,51,1,0,0,0,53,54,1,0,0,0,54,52,1,0,0,0,54,55,
        1,0,0,0,55,1,1,0,0,0,56,57,5,1,0,0,57,58,5,83,0,0,58,3,1,0,0,0,59,
        64,3,6,3,0,60,64,3,14,7,0,61,64,3,20,10,0,62,64,3,26,13,0,63,59,
        1,0,0,0,63,60,1,0,0,0,63,61,1,0,0,0,63,62,1,0,0,0,64,5,1,0,0,0,65,
        66,5,25,0,0,66,82,5,77,0,0,67,69,5,67,0,0,68,70,7,0,0,0,69,68,1,
        0,0,0,69,70,1,0,0,0,70,71,1,0,0,0,71,79,5,77,0,0,72,74,5,76,0,0,
        73,75,7,0,0,0,74,73,1,0,0,0,74,75,1,0,0,0,75,76,1,0,0,0,76,78,5,
        77,0,0,77,72,1,0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,79,80,1,0,0,0,80,
        83,1,0,0,0,81,79,1,0,0,0,82,67,1,0,0,0,82,83,1,0,0,0,83,84,1,0,0,
        0,84,85,5,72,0,0,85,86,3,8,4,0,86,87,5,73,0,0,87,88,5,66,0,0,88,
        7,1,0,0,0,89,90,7,0,0,0,90,92,5,67,0,0,91,89,1,0,0,0,91,92,1,0,0,
        0,92,96,1,0,0,0,93,97,3,10,5,0,94,97,3,20,10,0,95,97,3,26,13,0,96,
        93,1,0,0,0,96,94,1,0,0,0,96,95,1,0,0,0,97,99,1,0,0,0,98,91,1,0,0,
        0,99,102,1,0,0,0,100,98,1,0,0,0,100,101,1,0,0,0,101,9,1,0,0,0,102,
        100,1,0,0,0,103,104,5,77,0,0,104,113,5,68,0,0,105,110,3,22,11,0,
        106,107,5,76,0,0,107,109,3,22,11,0,108,106,1,0,0,0,109,112,1,0,0,
        0,110,108,1,0,0,0,110,111,1,0,0,0,111,114,1,0,0,0,112,110,1,0,0,
        0,113,105,1,0,0,0,113,114,1,0,0,0,114,115,1,0,0,0,115,116,5,69,0,
        0,116,117,5,72,0,0,117,118,3,28,14,0,118,119,5,73,0,0,119,11,1,0,
        0,0,120,121,5,2,0,0,121,122,5,77,0,0,122,126,5,72,0,0,123,125,3,
        26,13,0,124,123,1,0,0,0,125,128,1,0,0,0,126,124,1,0,0,0,126,127,
        1,0,0,0,127,132,1,0,0,0,128,126,1,0,0,0,129,131,3,20,10,0,130,129,
        1,0,0,0,131,134,1,0,0,0,132,130,1,0,0,0,132,133,1,0,0,0,133,138,
        1,0,0,0,134,132,1,0,0,0,135,137,3,16,8,0,136,135,1,0,0,0,137,140,
        1,0,0,0,138,136,1,0,0,0,138,139,1,0,0,0,139,144,1,0,0,0,140,138,
        1,0,0,0,141,143,3,14,7,0,142,141,1,0,0,0,143,146,1,0,0,0,144,142,
        1,0,0,0,144,145,1,0,0,0,145,147,1,0,0,0,146,144,1,0,0,0,147,148,
        5,73,0,0,148,149,5,66,0,0,149,13,1,0,0,0,150,152,5,26,0,0,151,153,
        5,25,0,0,152,151,1,0,0,0,152,153,1,0,0,0,153,154,1,0,0,0,154,155,
        5,77,0,0,155,172,5,72,0,0,156,159,5,77,0,0,157,158,5,57,0,0,158,
        160,5,78,0,0,159,157,1,0,0,0,159,160,1,0,0,0,160,169,1,0,0,0,161,
        162,5,76,0,0,162,165,5,77,0,0,163,164,5,57,0,0,164,166,5,78,0,0,
        165,163,1,0,0,0,165,166,1,0,0,0,166,168,1,0,0,0,167,161,1,0,0,0,
        168,171,1,0,0,0,169,167,1,0,0,0,169,170,1,0,0,0,170,173,1,0,0,0,
        171,169,1,0,0,0,172,156,1,0,0,0,172,173,1,0,0,0,173,174,1,0,0,0,
        174,175,5,73,0,0,175,176,5,66,0,0,176,15,1,0,0,0,177,178,5,24,0,
        0,178,179,5,77,0,0,179,180,5,72,0,0,180,181,3,18,9,0,181,182,5,73,
        0,0,182,183,5,66,0,0,183,17,1,0,0,0,184,185,7,0,0,0,185,187,5,67,
        0,0,186,184,1,0,0,0,186,187,1,0,0,0,187,190,1,0,0,0,188,191,3,20,
        10,0,189,191,3,26,13,0,190,188,1,0,0,0,190,189,1,0,0,0,191,202,1,
        0,0,0,192,193,7,0,0,0,193,195,5,67,0,0,194,192,1,0,0,0,194,195,1,
        0,0,0,195,198,1,0,0,0,196,199,3,20,10,0,197,199,3,26,13,0,198,196,
        1,0,0,0,198,197,1,0,0,0,199,201,1,0,0,0,200,194,1,0,0,0,201,204,
        1,0,0,0,202,200,1,0,0,0,202,203,1,0,0,0,203,19,1,0,0,0,204,202,1,
        0,0,0,205,206,3,22,11,0,206,207,5,66,0,0,207,21,1,0,0,0,208,210,
        5,23,0,0,209,208,1,0,0,0,209,210,1,0,0,0,210,212,1,0,0,0,211,213,
        5,22,0,0,212,211,1,0,0,0,212,213,1,0,0,0,213,333,1,0,0,0,214,216,
        5,12,0,0,215,214,1,0,0,0,215,216,1,0,0,0,216,217,1,0,0,0,217,218,
        5,3,0,0,218,227,5,77,0,0,219,225,5,57,0,0,220,226,5,79,0,0,221,223,
        3,44,22,0,222,221,1,0,0,0,222,223,1,0,0,0,223,224,1,0,0,0,224,226,
        5,77,0,0,225,220,1,0,0,0,225,222,1,0,0,0,226,228,1,0,0,0,227,219,
        1,0,0,0,227,228,1,0,0,0,228,334,1,0,0,0,229,231,5,12,0,0,230,229,
        1,0,0,0,230,231,1,0,0,0,231,232,1,0,0,0,232,233,5,4,0,0,233,242,
        5,77,0,0,234,240,5,57,0,0,235,241,5,78,0,0,236,238,3,44,22,0,237,
        236,1,0,0,0,237,238,1,0,0,0,238,239,1,0,0,0,239,241,5,77,0,0,240,
        235,1,0,0,0,240,237,1,0,0,0,241,243,1,0,0,0,242,234,1,0,0,0,242,
        243,1,0,0,0,243,334,1,0,0,0,244,246,5,12,0,0,245,244,1,0,0,0,245,
        246,1,0,0,0,246,247,1,0,0,0,247,249,5,7,0,0,248,250,5,7,0,0,249,
        248,1,0,0,0,249,250,1,0,0,0,250,251,1,0,0,0,251,260,5,77,0,0,252,
        258,5,57,0,0,253,259,5,78,0,0,254,256,3,44,22,0,255,254,1,0,0,0,
        255,256,1,0,0,0,256,257,1,0,0,0,257,259,5,77,0,0,258,253,1,0,0,0,
        258,255,1,0,0,0,259,261,1,0,0,0,260,252,1,0,0,0,260,261,1,0,0,0,
        261,334,1,0,0,0,262,264,5,12,0,0,263,262,1,0,0,0,263,264,1,0,0,0,
        264,266,1,0,0,0,265,267,5,7,0,0,266,265,1,0,0,0,266,267,1,0,0,0,
        267,269,1,0,0,0,268,270,5,7,0,0,269,268,1,0,0,0,269,270,1,0,0,0,
        270,271,1,0,0,0,271,272,5,6,0,0,272,281,5,77,0,0,273,279,5,57,0,
        0,274,280,5,78,0,0,275,277,3,44,22,0,276,275,1,0,0,0,276,277,1,0,
        0,0,277,278,1,0,0,0,278,280,5,77,0,0,279,274,1,0,0,0,279,276,1,0,
        0,0,280,282,1,0,0,0,281,273,1,0,0,0,281,282,1,0,0,0,282,334,1,0,
        0,0,283,284,5,8,0,0,284,293,5,77,0,0,285,291,5,57,0,0,286,292,5,
        80,0,0,287,289,3,44,22,0,288,287,1,0,0,0,288,289,1,0,0,0,289,290,
        1,0,0,0,290,292,5,77,0,0,291,286,1,0,0,0,291,288,1,0,0,0,292,294,
        1,0,0,0,293,285,1,0,0,0,293,294,1,0,0,0,294,334,1,0,0,0,295,296,
        5,9,0,0,296,305,5,77,0,0,297,303,5,57,0,0,298,304,5,81,0,0,299,301,
        3,44,22,0,300,299,1,0,0,0,300,301,1,0,0,0,301,302,1,0,0,0,302,304,
        5,77,0,0,303,298,1,0,0,0,303,300,1,0,0,0,304,306,1,0,0,0,305,297,
        1,0,0,0,305,306,1,0,0,0,306,334,1,0,0,0,307,308,5,11,0,0,308,317,
        5,77,0,0,309,315,5,57,0,0,310,316,5,38,0,0,311,313,3,44,22,0,312,
        311,1,0,0,0,312,313,1,0,0,0,313,314,1,0,0,0,314,316,5,77,0,0,315,
        310,1,0,0,0,315,312,1,0,0,0,316,318,1,0,0,0,317,309,1,0,0,0,317,
        318,1,0,0,0,318,334,1,0,0,0,319,320,5,13,0,0,320,321,5,77,0,0,321,
        331,5,57,0,0,322,332,5,78,0,0,323,332,5,79,0,0,324,332,5,81,0,0,
        325,332,5,80,0,0,326,332,5,38,0,0,327,329,3,44,22,0,328,327,1,0,
        0,0,328,329,1,0,0,0,329,330,1,0,0,0,330,332,5,77,0,0,331,322,1,0,
        0,0,331,323,1,0,0,0,331,324,1,0,0,0,331,325,1,0,0,0,331,326,1,0,
        0,0,331,328,1,0,0,0,332,334,1,0,0,0,333,215,1,0,0,0,333,230,1,0,
        0,0,333,245,1,0,0,0,333,263,1,0,0,0,333,283,1,0,0,0,333,295,1,0,
        0,0,333,307,1,0,0,0,333,319,1,0,0,0,334,23,1,0,0,0,335,336,5,77,
        0,0,336,343,5,57,0,0,337,339,3,44,22,0,338,337,1,0,0,0,338,339,1,
        0,0,0,339,340,1,0,0,0,340,344,5,77,0,0,341,344,7,1,0,0,342,344,3,
        30,15,0,343,338,1,0,0,0,343,341,1,0,0,0,343,342,1,0,0,0,344,345,
        1,0,0,0,345,346,5,66,0,0,346,25,1,0,0,0,347,349,5,23,0,0,348,347,
        1,0,0,0,348,349,1,0,0,0,349,351,1,0,0,0,350,352,5,22,0,0,351,350,
        1,0,0,0,351,352,1,0,0,0,352,373,1,0,0,0,353,374,5,10,0,0,354,356,
        5,12,0,0,355,354,1,0,0,0,355,356,1,0,0,0,356,357,1,0,0,0,357,374,
        5,3,0,0,358,360,5,12,0,0,359,358,1,0,0,0,359,360,1,0,0,0,360,361,
        1,0,0,0,361,374,5,4,0,0,362,364,5,12,0,0,363,362,1,0,0,0,363,364,
        1,0,0,0,364,365,1,0,0,0,365,374,5,7,0,0,366,368,5,12,0,0,367,366,
        1,0,0,0,367,368,1,0,0,0,368,369,1,0,0,0,369,374,5,6,0,0,370,374,
        5,8,0,0,371,374,5,9,0,0,372,374,5,11,0,0,373,353,1,0,0,0,373,355,
        1,0,0,0,373,359,1,0,0,0,373,363,1,0,0,0,373,367,1,0,0,0,373,370,
        1,0,0,0,373,371,1,0,0,0,373,372,1,0,0,0,374,375,1,0,0,0,375,376,
        5,77,0,0,376,385,5,68,0,0,377,382,3,22,11,0,378,379,5,76,0,0,379,
        381,3,22,11,0,380,378,1,0,0,0,381,384,1,0,0,0,382,380,1,0,0,0,382,
        383,1,0,0,0,383,386,1,0,0,0,384,382,1,0,0,0,385,377,1,0,0,0,385,
        386,1,0,0,0,386,387,1,0,0,0,387,388,5,69,0,0,388,389,5,72,0,0,389,
        390,3,28,14,0,390,391,5,73,0,0,391,27,1,0,0,0,392,405,3,32,16,0,
        393,405,3,36,18,0,394,395,3,46,23,0,395,396,5,66,0,0,396,405,1,0,
        0,0,397,405,3,42,21,0,398,405,3,30,15,0,399,405,3,20,10,0,400,405,
        3,24,12,0,401,402,3,44,22,0,402,403,5,77,0,0,403,405,1,0,0,0,404,
        392,1,0,0,0,404,393,1,0,0,0,404,394,1,0,0,0,404,397,1,0,0,0,404,
        398,1,0,0,0,404,399,1,0,0,0,404,400,1,0,0,0,404,401,1,0,0,0,405,
        408,1,0,0,0,406,404,1,0,0,0,406,407,1,0,0,0,407,418,1,0,0,0,408,
        406,1,0,0,0,409,415,5,21,0,0,410,412,3,44,22,0,411,410,1,0,0,0,411,
        412,1,0,0,0,412,413,1,0,0,0,413,416,5,77,0,0,414,416,7,1,0,0,415,
        411,1,0,0,0,415,414,1,0,0,0,415,416,1,0,0,0,416,417,1,0,0,0,417,
        419,5,66,0,0,418,409,1,0,0,0,418,419,1,0,0,0,419,29,1,0,0,0,420,
        422,3,44,22,0,421,420,1,0,0,0,421,422,1,0,0,0,422,423,1,0,0,0,423,
        424,5,77,0,0,424,430,5,68,0,0,425,427,3,44,22,0,426,425,1,0,0,0,
        426,427,1,0,0,0,427,428,1,0,0,0,428,431,5,77,0,0,429,431,7,1,0,0,
        430,426,1,0,0,0,430,429,1,0,0,0,430,431,1,0,0,0,431,439,1,0,0,0,
        432,435,5,76,0,0,433,436,5,77,0,0,434,436,7,1,0,0,435,433,1,0,0,
        0,435,434,1,0,0,0,436,438,1,0,0,0,437,432,1,0,0,0,438,441,1,0,0,
        0,439,437,1,0,0,0,439,440,1,0,0,0,440,442,1,0,0,0,441,439,1,0,0,
        0,442,443,5,69,0,0,443,31,1,0,0,0,444,445,5,17,0,0,445,450,5,68,
        0,0,446,451,3,20,10,0,447,448,5,77,0,0,448,451,5,66,0,0,449,451,
        3,24,12,0,450,446,1,0,0,0,450,447,1,0,0,0,450,449,1,0,0,0,451,452,
        1,0,0,0,452,453,3,38,19,0,453,454,5,66,0,0,454,455,3,46,23,0,455,
        456,5,69,0,0,456,457,5,72,0,0,457,458,3,34,17,0,458,459,5,73,0,0,
        459,33,1,0,0,0,460,486,3,32,16,0,461,486,3,36,18,0,462,463,5,20,
        0,0,463,486,5,66,0,0,464,465,5,19,0,0,465,486,5,66,0,0,466,467,3,
        46,23,0,467,468,5,66,0,0,468,486,1,0,0,0,469,486,3,42,21,0,470,486,
        3,20,10,0,471,486,3,24,12,0,472,486,3,30,15,0,473,479,5,21,0,0,474,
        476,3,44,22,0,475,474,1,0,0,0,475,476,1,0,0,0,476,477,1,0,0,0,477,
        480,5,77,0,0,478,480,7,1,0,0,479,475,1,0,0,0,479,478,1,0,0,0,479,
        480,1,0,0,0,480,486,1,0,0,0,481,483,3,44,22,0,482,481,1,0,0,0,482,
        483,1,0,0,0,483,484,1,0,0,0,484,486,5,66,0,0,485,460,1,0,0,0,485,
        461,1,0,0,0,485,462,1,0,0,0,485,464,1,0,0,0,485,466,1,0,0,0,485,
        469,1,0,0,0,485,470,1,0,0,0,485,471,1,0,0,0,485,472,1,0,0,0,485,
        473,1,0,0,0,485,482,1,0,0,0,486,488,1,0,0,0,487,485,1,0,0,0,488,
        491,1,0,0,0,489,487,1,0,0,0,489,490,1,0,0,0,490,35,1,0,0,0,491,489,
        1,0,0,0,492,493,5,18,0,0,493,494,5,68,0,0,494,495,3,38,19,0,495,
        496,5,69,0,0,496,497,5,72,0,0,497,498,3,34,17,0,498,499,5,73,0,0,
        499,37,1,0,0,0,500,507,3,40,20,0,501,502,5,56,0,0,502,503,5,68,0,
        0,503,504,3,40,20,0,504,505,5,69,0,0,505,507,1,0,0,0,506,500,1,0,
        0,0,506,501,1,0,0,0,507,519,1,0,0,0,508,515,7,2,0,0,509,516,3,40,
        20,0,510,511,5,56,0,0,511,512,5,68,0,0,512,513,3,40,20,0,513,514,
        5,69,0,0,514,516,1,0,0,0,515,509,1,0,0,0,515,510,1,0,0,0,516,518,
        1,0,0,0,517,508,1,0,0,0,518,521,1,0,0,0,519,517,1,0,0,0,519,520,
        1,0,0,0,520,39,1,0,0,0,521,519,1,0,0,0,522,524,3,44,22,0,523,522,
        1,0,0,0,523,524,1,0,0,0,524,525,1,0,0,0,525,528,5,77,0,0,526,528,
        7,1,0,0,527,523,1,0,0,0,527,526,1,0,0,0,528,537,1,0,0,0,529,535,
        7,3,0,0,530,532,3,44,22,0,531,530,1,0,0,0,531,532,1,0,0,0,532,533,
        1,0,0,0,533,536,5,77,0,0,534,536,7,1,0,0,535,531,1,0,0,0,535,534,
        1,0,0,0,536,538,1,0,0,0,537,529,1,0,0,0,537,538,1,0,0,0,538,41,1,
        0,0,0,539,540,5,14,0,0,540,541,5,68,0,0,541,542,3,38,19,0,542,543,
        5,69,0,0,543,544,5,72,0,0,544,545,3,34,17,0,545,556,5,73,0,0,546,
        547,5,16,0,0,547,548,5,68,0,0,548,549,3,38,19,0,549,550,5,69,0,0,
        550,551,5,72,0,0,551,552,3,34,17,0,552,553,5,73,0,0,553,555,1,0,
        0,0,554,546,1,0,0,0,555,558,1,0,0,0,556,554,1,0,0,0,556,557,1,0,
        0,0,557,564,1,0,0,0,558,556,1,0,0,0,559,560,5,15,0,0,560,561,5,72,
        0,0,561,562,3,34,17,0,562,563,5,73,0,0,563,565,1,0,0,0,564,559,1,
        0,0,0,564,565,1,0,0,0,565,43,1,0,0,0,566,567,5,77,0,0,567,572,5,
        74,0,0,568,569,5,77,0,0,569,571,5,74,0,0,570,568,1,0,0,0,571,574,
        1,0,0,0,572,570,1,0,0,0,572,573,1,0,0,0,573,45,1,0,0,0,574,572,1,
        0,0,0,575,586,5,77,0,0,576,587,5,41,0,0,577,587,5,42,0,0,578,579,
        5,58,0,0,579,587,3,48,24,0,580,581,5,59,0,0,581,587,3,48,24,0,582,
        583,5,60,0,0,583,587,3,48,24,0,584,585,5,61,0,0,585,587,3,48,24,
        0,586,576,1,0,0,0,586,577,1,0,0,0,586,578,1,0,0,0,586,580,1,0,0,
        0,586,582,1,0,0,0,586,584,1,0,0,0,587,47,1,0,0,0,588,590,3,44,22,
        0,589,588,1,0,0,0,589,590,1,0,0,0,590,591,1,0,0,0,591,595,5,77,0,
        0,592,595,7,1,0,0,593,595,3,30,15,0,594,589,1,0,0,0,594,592,1,0,
        0,0,594,593,1,0,0,0,595,49,1,0,0,0,100,52,54,63,69,74,79,82,91,96,
        100,110,113,126,132,138,144,152,159,165,169,172,186,190,194,198,
        202,209,212,215,222,225,227,230,237,240,242,245,249,255,258,260,
        263,266,269,276,279,281,288,291,293,300,303,305,312,315,317,328,
        331,333,338,343,348,351,355,359,363,367,373,382,385,404,406,411,
        415,418,421,426,430,435,439,450,475,479,482,485,489,506,515,519,
        523,527,531,535,537,556,564,572,586,589,594
    ]

class CppGrammarParser ( Parser ):

    grammarFileName = "CppGrammar.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'#include'", "'namespace'", "'char'", 
                     "'short'", "<INVALID>", "'int'", "'long'", "'float'", 
                     "'double'", "'void'", "'bool'", "'unsigned'", "'auto'", 
                     "'if'", "'else'", "'else if'", "'for'", "'while'", 
                     "'continue'", "'break'", "'return'", "'const'", "'static'", 
                     "'struct'", "'class'", "'enum'", "'virtual'", "'new'", 
                     "'delete'", "'nullptr'", "'operator'", "'override'", 
                     "'private'", "'protected'", "'public'", "'sizeof'", 
                     "'this'", "<INVALID>", "'false'", "'true'", "'++'", 
                     "'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
                     "'!='", "'>'", "'>='", "'<'", "'<='", "'&&'", "'||'", 
                     "'!'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", 
                     "'->'", "'?'", "'...'", "';'", "':'", "'('", "')'", 
                     "'['", "']'", "'{'", "'}'", "'::'", "'.'", "','" ]

    symbolicNames = [ "<INVALID>", "INCLUDE", "NAMESPACE", "CHAR", "SHORT", 
                      "INT_TYPE", "INT", "LONG", "FLOAT", "DOUBLE", "VOID", 
                      "BOOL", "UNSIGNED", "AUTO", "IF", "ELSE", "ELSE_IF", 
                      "FOR", "WHILE", "CONTINUE", "BREAK", "RETURN", "CONST", 
                      "STATIC", "STRUCT", "CLASS", "ENUM", "VIRTUAL", "NEW", 
                      "DELETE", "NULLPTR", "OPERATOR", "OVERRIDE", "PRIVATE", 
                      "PROTECTED", "PUBLIC", "SIZEOF", "THIS", "BOOL_LITERAL", 
                      "FALSE", "TRUE", "INCREMENT", "DECREMENT", "ADD", 
                      "SUBSTRACT", "MULTIPLY", "DIVIDE", "MODULO", "EQUAL", 
                      "NONEQUAL", "GREATER", "GREATER_EQUAL", "LESSER", 
                      "LESSER_EQUAL", "LOG_AND", "LOG_OR", "LOG_NOT", "ASSIGN", 
                      "ASSIGN_ADD", "ASSIGN_SUBSTRACT", "ASSIGN_MULTIPLY", 
                      "ASSIGN_DIVIDE", "ASSIGN_MODULO", "ARROW", "QUESTION_MARK", 
                      "ELLIPSIS", "SEMICOLON", "COLON", "LEFT_PARENTHESIS", 
                      "RIGHT_PARENTHESIS", "LEFT_SQUARE", "RIGHT_SQUARE", 
                      "LEFT_BRACKET", "RIGHT_BRACKET", "SCOPE_RESOLUTION", 
                      "DOT", "COMMA", "ID", "INT_LITERAL", "CHAR_LITERAL", 
                      "FLOAT_LITERAL", "DOUBLE_LITERAL", "ANY_LITERAL", 
                      "INCLUDELITERAL", "Whitespace" ]

    RULE_program = 0
    RULE_include = 1
    RULE_statement = 2
    RULE_class = 3
    RULE_class_scope = 4
    RULE_constructor = 5
    RULE_namespace = 6
    RULE_enum = 7
    RULE_struct = 8
    RULE_struct_body = 9
    RULE_variable_declaration = 10
    RULE_variable = 11
    RULE_assign = 12
    RULE_function = 13
    RULE_function_scope = 14
    RULE_function_call = 15
    RULE_for_loop = 16
    RULE_loop_scope = 17
    RULE_while_loop = 18
    RULE_if_expression = 19
    RULE_inside_if = 20
    RULE_if_statement = 21
    RULE_enum_namespace_call = 22
    RULE_arithmetic_operation = 23
    RULE_assingment_options = 24

    ruleNames =  [ "program", "include", "statement", "class", "class_scope", 
                   "constructor", "namespace", "enum", "struct", "struct_body", 
                   "variable_declaration", "variable", "assign", "function", 
                   "function_scope", "function_call", "for_loop", "loop_scope", 
                   "while_loop", "if_expression", "inside_if", "if_statement", 
                   "enum_namespace_call", "arithmetic_operation", "assingment_options" ]

    EOF = Token.EOF
    INCLUDE=1
    NAMESPACE=2
    CHAR=3
    SHORT=4
    INT_TYPE=5
    INT=6
    LONG=7
    FLOAT=8
    DOUBLE=9
    VOID=10
    BOOL=11
    UNSIGNED=12
    AUTO=13
    IF=14
    ELSE=15
    ELSE_IF=16
    FOR=17
    WHILE=18
    CONTINUE=19
    BREAK=20
    RETURN=21
    CONST=22
    STATIC=23
    STRUCT=24
    CLASS=25
    ENUM=26
    VIRTUAL=27
    NEW=28
    DELETE=29
    NULLPTR=30
    OPERATOR=31
    OVERRIDE=32
    PRIVATE=33
    PROTECTED=34
    PUBLIC=35
    SIZEOF=36
    THIS=37
    BOOL_LITERAL=38
    FALSE=39
    TRUE=40
    INCREMENT=41
    DECREMENT=42
    ADD=43
    SUBSTRACT=44
    MULTIPLY=45
    DIVIDE=46
    MODULO=47
    EQUAL=48
    NONEQUAL=49
    GREATER=50
    GREATER_EQUAL=51
    LESSER=52
    LESSER_EQUAL=53
    LOG_AND=54
    LOG_OR=55
    LOG_NOT=56
    ASSIGN=57
    ASSIGN_ADD=58
    ASSIGN_SUBSTRACT=59
    ASSIGN_MULTIPLY=60
    ASSIGN_DIVIDE=61
    ASSIGN_MODULO=62
    ARROW=63
    QUESTION_MARK=64
    ELLIPSIS=65
    SEMICOLON=66
    COLON=67
    LEFT_PARENTHESIS=68
    RIGHT_PARENTHESIS=69
    LEFT_SQUARE=70
    RIGHT_SQUARE=71
    LEFT_BRACKET=72
    RIGHT_BRACKET=73
    SCOPE_RESOLUTION=74
    DOT=75
    COMMA=76
    ID=77
    INT_LITERAL=78
    CHAR_LITERAL=79
    FLOAT_LITERAL=80
    DOUBLE_LITERAL=81
    ANY_LITERAL=82
    INCLUDELITERAL=83
    Whitespace=84

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def include(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.IncludeContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.IncludeContext,i)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.StatementContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.StatementContext,i)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = CppGrammarParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 52 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 52
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1]:
                    self.state = 50
                    self.include()
                    pass
                elif token in [3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 22, 23, 25, 26]:
                    self.state = 51
                    self.statement()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 54 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 113262554) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class IncludeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def INCLUDE(self):
            return self.getToken(CppGrammarParser.INCLUDE, 0)

        def INCLUDELITERAL(self):
            return self.getToken(CppGrammarParser.INCLUDELITERAL, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_include

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInclude" ):
                listener.enterInclude(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInclude" ):
                listener.exitInclude(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInclude" ):
                return visitor.visitInclude(self)
            else:
                return visitor.visitChildren(self)




    def include(self):

        localctx = CppGrammarParser.IncludeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_include)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 56
            self.match(CppGrammarParser.INCLUDE)
            self.state = 57
            self.match(CppGrammarParser.INCLUDELITERAL)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def class_(self):
            return self.getTypedRuleContext(CppGrammarParser.ClassContext,0)


        def enum(self):
            return self.getTypedRuleContext(CppGrammarParser.EnumContext,0)


        def variable_declaration(self):
            return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,0)


        def function(self):
            return self.getTypedRuleContext(CppGrammarParser.FunctionContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = CppGrammarParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 63
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 59
                self.class_()
                pass

            elif la_ == 2:
                self.state = 60
                self.enum()
                pass

            elif la_ == 3:
                self.state = 61
                self.variable_declaration()
                pass

            elif la_ == 4:
                self.state = 62
                self.function()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ClassContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CLASS(self):
            return self.getToken(CppGrammarParser.CLASS, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def class_scope(self):
            return self.getTypedRuleContext(CppGrammarParser.Class_scopeContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def COLON(self):
            return self.getToken(CppGrammarParser.COLON, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COMMA)
            else:
                return self.getToken(CppGrammarParser.COMMA, i)

        def PRIVATE(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PRIVATE)
            else:
                return self.getToken(CppGrammarParser.PRIVATE, i)

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PUBLIC)
            else:
                return self.getToken(CppGrammarParser.PUBLIC, i)

        def PROTECTED(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PROTECTED)
            else:
                return self.getToken(CppGrammarParser.PROTECTED, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_class

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClass" ):
                listener.enterClass(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClass" ):
                listener.exitClass(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass" ):
                return visitor.visitClass(self)
            else:
                return visitor.visitChildren(self)




    def class_(self):

        localctx = CppGrammarParser.ClassContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_class)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 65
            self.match(CppGrammarParser.CLASS)
            self.state = 66
            self.match(CppGrammarParser.ID)
            self.state = 82
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==67:
                self.state = 67
                self.match(CppGrammarParser.COLON)
                self.state = 69
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0):
                    self.state = 68
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()


                self.state = 71
                self.match(CppGrammarParser.ID)
                self.state = 79
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==76:
                    self.state = 72
                    self.match(CppGrammarParser.COMMA)
                    self.state = 74
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if (((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0):
                        self.state = 73
                        _la = self._input.LA(1)
                        if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()


                    self.state = 76
                    self.match(CppGrammarParser.ID)
                    self.state = 81
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 84
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 85
            self.class_scope()
            self.state = 86
            self.match(CppGrammarParser.RIGHT_BRACKET)
            self.state = 87
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Class_scopeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def constructor(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.ConstructorContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.ConstructorContext,i)


        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,i)


        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.FunctionContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.FunctionContext,i)


        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COLON)
            else:
                return self.getToken(CppGrammarParser.COLON, i)

        def PRIVATE(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PRIVATE)
            else:
                return self.getToken(CppGrammarParser.PRIVATE, i)

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PUBLIC)
            else:
                return self.getToken(CppGrammarParser.PUBLIC, i)

        def PROTECTED(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PROTECTED)
            else:
                return self.getToken(CppGrammarParser.PROTECTED, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_class_scope

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterClass_scope" ):
                listener.enterClass_scope(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitClass_scope" ):
                listener.exitClass_scope(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitClass_scope" ):
                return visitor.visitClass_scope(self)
            else:
                return visitor.visitChildren(self)




    def class_scope(self):

        localctx = CppGrammarParser.Class_scopeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_class_scope)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 60142141400) != 0) or _la==77:
                self.state = 91
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0):
                    self.state = 89
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 90
                    self.match(CppGrammarParser.COLON)


                self.state = 96
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
                if la_ == 1:
                    self.state = 93
                    self.constructor()
                    pass

                elif la_ == 2:
                    self.state = 94
                    self.variable_declaration()
                    pass

                elif la_ == 3:
                    self.state = 95
                    self.function()
                    pass


                self.state = 102
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConstructorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def LEFT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, 0)

        def RIGHT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def function_scope(self):
            return self.getTypedRuleContext(CppGrammarParser.Function_scopeContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.VariableContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.VariableContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COMMA)
            else:
                return self.getToken(CppGrammarParser.COMMA, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_constructor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConstructor" ):
                listener.enterConstructor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConstructor" ):
                listener.exitConstructor(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConstructor" ):
                return visitor.visitConstructor(self)
            else:
                return visitor.visitChildren(self)




    def constructor(self):

        localctx = CppGrammarParser.ConstructorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_constructor)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 103
            self.match(CppGrammarParser.ID)
            self.state = 104
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 113
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 12598232) != 0):
                self.state = 105
                self.variable()
                self.state = 110
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==76:
                    self.state = 106
                    self.match(CppGrammarParser.COMMA)
                    self.state = 107
                    self.variable()
                    self.state = 112
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 115
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
            self.state = 116
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 117
            self.function_scope()
            self.state = 118
            self.match(CppGrammarParser.RIGHT_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class NamespaceContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NAMESPACE(self):
            return self.getToken(CppGrammarParser.NAMESPACE, 0)

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.FunctionContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.FunctionContext,i)


        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,i)


        def struct(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.StructContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.StructContext,i)


        def enum(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.EnumContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.EnumContext,i)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_namespace

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNamespace" ):
                listener.enterNamespace(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNamespace" ):
                listener.exitNamespace(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitNamespace" ):
                return visitor.visitNamespace(self)
            else:
                return visitor.visitChildren(self)




    def namespace(self):

        localctx = CppGrammarParser.NamespaceContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_namespace)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 120
            self.match(CppGrammarParser.NAMESPACE)
            self.state = 121
            self.match(CppGrammarParser.ID)
            self.state = 122
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 126
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,12,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 123
                    self.function() 
                self.state = 128
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,12,self._ctx)

            self.state = 132
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 12598232) != 0):
                self.state = 129
                self.variable_declaration()
                self.state = 134
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 138
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==24:
                self.state = 135
                self.struct()
                self.state = 140
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 144
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==26:
                self.state = 141
                self.enum()
                self.state = 146
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 147
            self.match(CppGrammarParser.RIGHT_BRACKET)
            self.state = 148
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EnumContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ENUM(self):
            return self.getToken(CppGrammarParser.ENUM, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def CLASS(self):
            return self.getToken(CppGrammarParser.CLASS, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COMMA)
            else:
                return self.getToken(CppGrammarParser.COMMA, i)

        def ASSIGN(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ASSIGN)
            else:
                return self.getToken(CppGrammarParser.ASSIGN, i)

        def INT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.INT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.INT_LITERAL, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_enum

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnum" ):
                listener.enterEnum(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnum" ):
                listener.exitEnum(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEnum" ):
                return visitor.visitEnum(self)
            else:
                return visitor.visitChildren(self)




    def enum(self):

        localctx = CppGrammarParser.EnumContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_enum)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 150
            self.match(CppGrammarParser.ENUM)
            self.state = 152
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==25:
                self.state = 151
                self.match(CppGrammarParser.CLASS)


            self.state = 154
            self.match(CppGrammarParser.ID)
            self.state = 155
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 172
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==77:
                self.state = 156
                self.match(CppGrammarParser.ID)
                self.state = 159
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 157
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 158
                    self.match(CppGrammarParser.INT_LITERAL)


                self.state = 169
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==76:
                    self.state = 161
                    self.match(CppGrammarParser.COMMA)
                    self.state = 162
                    self.match(CppGrammarParser.ID)
                    self.state = 165
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==57:
                        self.state = 163
                        self.match(CppGrammarParser.ASSIGN)
                        self.state = 164
                        self.match(CppGrammarParser.INT_LITERAL)


                    self.state = 171
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 174
            self.match(CppGrammarParser.RIGHT_BRACKET)
            self.state = 175
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StructContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRUCT(self):
            return self.getToken(CppGrammarParser.STRUCT, 0)

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def struct_body(self):
            return self.getTypedRuleContext(CppGrammarParser.Struct_bodyContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_struct

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStruct" ):
                listener.enterStruct(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStruct" ):
                listener.exitStruct(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStruct" ):
                return visitor.visitStruct(self)
            else:
                return visitor.visitChildren(self)




    def struct(self):

        localctx = CppGrammarParser.StructContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_struct)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 177
            self.match(CppGrammarParser.STRUCT)
            self.state = 178
            self.match(CppGrammarParser.ID)
            self.state = 179
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 180
            self.struct_body()
            self.state = 181
            self.match(CppGrammarParser.RIGHT_BRACKET)
            self.state = 182
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Struct_bodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,i)


        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.FunctionContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.FunctionContext,i)


        def COLON(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COLON)
            else:
                return self.getToken(CppGrammarParser.COLON, i)

        def PRIVATE(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PRIVATE)
            else:
                return self.getToken(CppGrammarParser.PRIVATE, i)

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PUBLIC)
            else:
                return self.getToken(CppGrammarParser.PUBLIC, i)

        def PROTECTED(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.PROTECTED)
            else:
                return self.getToken(CppGrammarParser.PROTECTED, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_struct_body

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStruct_body" ):
                listener.enterStruct_body(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStruct_body" ):
                listener.exitStruct_body(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStruct_body" ):
                return visitor.visitStruct_body(self)
            else:
                return visitor.visitChildren(self)




    def struct_body(self):

        localctx = CppGrammarParser.Struct_bodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_struct_body)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 186
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0):
                self.state = 184
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 185
                self.match(CppGrammarParser.COLON)


            self.state = 190
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.state = 188
                self.variable_declaration()
                pass

            elif la_ == 2:
                self.state = 189
                self.function()
                pass


            self.state = 202
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 60142141400) != 0):
                self.state = 194
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if (((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0):
                    self.state = 192
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 60129542144) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    self.state = 193
                    self.match(CppGrammarParser.COLON)


                self.state = 198
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,24,self._ctx)
                if la_ == 1:
                    self.state = 196
                    self.variable_declaration()
                    pass

                elif la_ == 2:
                    self.state = 197
                    self.function()
                    pass


                self.state = 204
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_declarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def variable(self):
            return self.getTypedRuleContext(CppGrammarParser.VariableContext,0)


        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_variable_declaration

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable_declaration" ):
                listener.enterVariable_declaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable_declaration" ):
                listener.exitVariable_declaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable_declaration" ):
                return visitor.visitVariable_declaration(self)
            else:
                return visitor.visitChildren(self)




    def variable_declaration(self):

        localctx = CppGrammarParser.Variable_declarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_variable_declaration)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            self.variable()
            self.state = 206
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def CHAR(self):
            return self.getToken(CppGrammarParser.CHAR, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def SHORT(self):
            return self.getToken(CppGrammarParser.SHORT, 0)

        def LONG(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LONG)
            else:
                return self.getToken(CppGrammarParser.LONG, i)

        def INT(self):
            return self.getToken(CppGrammarParser.INT, 0)

        def FLOAT(self):
            return self.getToken(CppGrammarParser.FLOAT, 0)

        def DOUBLE(self):
            return self.getToken(CppGrammarParser.DOUBLE, 0)

        def BOOL(self):
            return self.getToken(CppGrammarParser.BOOL, 0)

        def AUTO(self):
            return self.getToken(CppGrammarParser.AUTO, 0)

        def ASSIGN(self):
            return self.getToken(CppGrammarParser.ASSIGN, 0)

        def STATIC(self):
            return self.getToken(CppGrammarParser.STATIC, 0)

        def CONST(self):
            return self.getToken(CppGrammarParser.CONST, 0)

        def INT_LITERAL(self):
            return self.getToken(CppGrammarParser.INT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(CppGrammarParser.CHAR_LITERAL, 0)

        def DOUBLE_LITERAL(self):
            return self.getToken(CppGrammarParser.DOUBLE_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(CppGrammarParser.FLOAT_LITERAL, 0)

        def BOOL_LITERAL(self):
            return self.getToken(CppGrammarParser.BOOL_LITERAL, 0)

        def UNSIGNED(self):
            return self.getToken(CppGrammarParser.UNSIGNED, 0)

        def enum_namespace_call(self):
            return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitVariable" ):
                return visitor.visitVariable(self)
            else:
                return visitor.visitChildren(self)




    def variable(self):

        localctx = CppGrammarParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_variable)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 209
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==23:
                self.state = 208
                self.match(CppGrammarParser.STATIC)


            self.state = 212
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==22:
                self.state = 211
                self.match(CppGrammarParser.CONST)


            self.state = 333
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,58,self._ctx)
            if la_ == 1:
                self.state = 215
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 214
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 217
                self.match(CppGrammarParser.CHAR)
                self.state = 218
                self.match(CppGrammarParser.ID)
                self.state = 227
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 219
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 225
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [79]:
                        self.state = 220
                        self.match(CppGrammarParser.CHAR_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 222
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,29,self._ctx)
                        if la_ == 1:
                            self.state = 221
                            self.enum_namespace_call()


                        self.state = 224
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 2:
                self.state = 230
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 229
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 232
                self.match(CppGrammarParser.SHORT)
                self.state = 233
                self.match(CppGrammarParser.ID)
                self.state = 242
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 234
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 240
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [78]:
                        self.state = 235
                        self.match(CppGrammarParser.INT_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 237
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,33,self._ctx)
                        if la_ == 1:
                            self.state = 236
                            self.enum_namespace_call()


                        self.state = 239
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 3:
                self.state = 245
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 244
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 247
                self.match(CppGrammarParser.LONG)
                self.state = 249
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==7:
                    self.state = 248
                    self.match(CppGrammarParser.LONG)


                self.state = 251
                self.match(CppGrammarParser.ID)
                self.state = 260
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 252
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 258
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [78]:
                        self.state = 253
                        self.match(CppGrammarParser.INT_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 255
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,38,self._ctx)
                        if la_ == 1:
                            self.state = 254
                            self.enum_namespace_call()


                        self.state = 257
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 4:
                self.state = 263
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 262
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 266
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,42,self._ctx)
                if la_ == 1:
                    self.state = 265
                    self.match(CppGrammarParser.LONG)


                self.state = 269
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==7:
                    self.state = 268
                    self.match(CppGrammarParser.LONG)


                self.state = 271
                self.match(CppGrammarParser.INT)
                self.state = 272
                self.match(CppGrammarParser.ID)
                self.state = 281
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 273
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 279
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [78]:
                        self.state = 274
                        self.match(CppGrammarParser.INT_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 276
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,44,self._ctx)
                        if la_ == 1:
                            self.state = 275
                            self.enum_namespace_call()


                        self.state = 278
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 5:
                self.state = 283
                self.match(CppGrammarParser.FLOAT)
                self.state = 284
                self.match(CppGrammarParser.ID)
                self.state = 293
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 285
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 291
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [80]:
                        self.state = 286
                        self.match(CppGrammarParser.FLOAT_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 288
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,47,self._ctx)
                        if la_ == 1:
                            self.state = 287
                            self.enum_namespace_call()


                        self.state = 290
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 6:
                self.state = 295
                self.match(CppGrammarParser.DOUBLE)
                self.state = 296
                self.match(CppGrammarParser.ID)
                self.state = 305
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 297
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 303
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [81]:
                        self.state = 298
                        self.match(CppGrammarParser.DOUBLE_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 300
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,50,self._ctx)
                        if la_ == 1:
                            self.state = 299
                            self.enum_namespace_call()


                        self.state = 302
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 7:
                self.state = 307
                self.match(CppGrammarParser.BOOL)
                self.state = 308
                self.match(CppGrammarParser.ID)
                self.state = 317
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==57:
                    self.state = 309
                    self.match(CppGrammarParser.ASSIGN)
                    self.state = 315
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [38]:
                        self.state = 310
                        self.match(CppGrammarParser.BOOL_LITERAL)
                        pass
                    elif token in [77]:
                        self.state = 312
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,53,self._ctx)
                        if la_ == 1:
                            self.state = 311
                            self.enum_namespace_call()


                        self.state = 314
                        self.match(CppGrammarParser.ID)
                        pass
                    else:
                        raise NoViableAltException(self)



                pass

            elif la_ == 8:
                self.state = 319
                self.match(CppGrammarParser.AUTO)
                self.state = 320
                self.match(CppGrammarParser.ID)
                self.state = 321
                self.match(CppGrammarParser.ASSIGN)
                self.state = 331
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [78]:
                    self.state = 322
                    self.match(CppGrammarParser.INT_LITERAL)
                    pass
                elif token in [79]:
                    self.state = 323
                    self.match(CppGrammarParser.CHAR_LITERAL)
                    pass
                elif token in [81]:
                    self.state = 324
                    self.match(CppGrammarParser.DOUBLE_LITERAL)
                    pass
                elif token in [80]:
                    self.state = 325
                    self.match(CppGrammarParser.FLOAT_LITERAL)
                    pass
                elif token in [38]:
                    self.state = 326
                    self.match(CppGrammarParser.BOOL_LITERAL)
                    pass
                elif token in [77]:
                    self.state = 328
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,56,self._ctx)
                    if la_ == 1:
                        self.state = 327
                        self.enum_namespace_call()


                    self.state = 330
                    self.match(CppGrammarParser.ID)
                    pass
                else:
                    raise NoViableAltException(self)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def ASSIGN(self):
            return self.getToken(CppGrammarParser.ASSIGN, 0)

        def SEMICOLON(self):
            return self.getToken(CppGrammarParser.SEMICOLON, 0)

        def function_call(self):
            return self.getTypedRuleContext(CppGrammarParser.Function_callContext,0)


        def INT_LITERAL(self):
            return self.getToken(CppGrammarParser.INT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(CppGrammarParser.CHAR_LITERAL, 0)

        def DOUBLE_LITERAL(self):
            return self.getToken(CppGrammarParser.DOUBLE_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(CppGrammarParser.FLOAT_LITERAL, 0)

        def BOOL_LITERAL(self):
            return self.getToken(CppGrammarParser.BOOL_LITERAL, 0)

        def enum_namespace_call(self):
            return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_assign

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssign" ):
                listener.enterAssign(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssign" ):
                listener.exitAssign(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssign" ):
                return visitor.visitAssign(self)
            else:
                return visitor.visitChildren(self)




    def assign(self):

        localctx = CppGrammarParser.AssignContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_assign)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 335
            self.match(CppGrammarParser.ID)
            self.state = 336
            self.match(CppGrammarParser.ASSIGN)
            self.state = 343
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,60,self._ctx)
            if la_ == 1:
                self.state = 338
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,59,self._ctx)
                if la_ == 1:
                    self.state = 337
                    self.enum_namespace_call()


                self.state = 340
                self.match(CppGrammarParser.ID)
                pass

            elif la_ == 2:
                self.state = 341
                _la = self._input.LA(1)
                if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 3:
                self.state = 342
                self.function_call()
                pass


            self.state = 345
            self.match(CppGrammarParser.SEMICOLON)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def LEFT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, 0)

        def RIGHT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def function_scope(self):
            return self.getTypedRuleContext(CppGrammarParser.Function_scopeContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def VOID(self):
            return self.getToken(CppGrammarParser.VOID, 0)

        def CHAR(self):
            return self.getToken(CppGrammarParser.CHAR, 0)

        def SHORT(self):
            return self.getToken(CppGrammarParser.SHORT, 0)

        def LONG(self):
            return self.getToken(CppGrammarParser.LONG, 0)

        def INT(self):
            return self.getToken(CppGrammarParser.INT, 0)

        def FLOAT(self):
            return self.getToken(CppGrammarParser.FLOAT, 0)

        def DOUBLE(self):
            return self.getToken(CppGrammarParser.DOUBLE, 0)

        def BOOL(self):
            return self.getToken(CppGrammarParser.BOOL, 0)

        def STATIC(self):
            return self.getToken(CppGrammarParser.STATIC, 0)

        def CONST(self):
            return self.getToken(CppGrammarParser.CONST, 0)

        def variable(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.VariableContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.VariableContext,i)


        def UNSIGNED(self):
            return self.getToken(CppGrammarParser.UNSIGNED, 0)

        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COMMA)
            else:
                return self.getToken(CppGrammarParser.COMMA, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_function

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction" ):
                listener.enterFunction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction" ):
                listener.exitFunction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction" ):
                return visitor.visitFunction(self)
            else:
                return visitor.visitChildren(self)




    def function(self):

        localctx = CppGrammarParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_function)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 348
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==23:
                self.state = 347
                self.match(CppGrammarParser.STATIC)


            self.state = 351
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==22:
                self.state = 350
                self.match(CppGrammarParser.CONST)


            self.state = 373
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,67,self._ctx)
            if la_ == 1:
                self.state = 353
                self.match(CppGrammarParser.VOID)
                pass

            elif la_ == 2:
                self.state = 355
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 354
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 357
                self.match(CppGrammarParser.CHAR)
                pass

            elif la_ == 3:
                self.state = 359
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 358
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 361
                self.match(CppGrammarParser.SHORT)
                pass

            elif la_ == 4:
                self.state = 363
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 362
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 365
                self.match(CppGrammarParser.LONG)
                pass

            elif la_ == 5:
                self.state = 367
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==12:
                    self.state = 366
                    self.match(CppGrammarParser.UNSIGNED)


                self.state = 369
                self.match(CppGrammarParser.INT)
                pass

            elif la_ == 6:
                self.state = 370
                self.match(CppGrammarParser.FLOAT)
                pass

            elif la_ == 7:
                self.state = 371
                self.match(CppGrammarParser.DOUBLE)
                pass

            elif la_ == 8:
                self.state = 372
                self.match(CppGrammarParser.BOOL)
                pass


            self.state = 375
            self.match(CppGrammarParser.ID)
            self.state = 376
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 385
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 12598232) != 0):
                self.state = 377
                self.variable()
                self.state = 382
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==76:
                    self.state = 378
                    self.match(CppGrammarParser.COMMA)
                    self.state = 379
                    self.variable()
                    self.state = 384
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 387
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
            self.state = 388
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 389
            self.function_scope()
            self.state = 390
            self.match(CppGrammarParser.RIGHT_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_scopeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def for_loop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.For_loopContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.For_loopContext,i)


        def while_loop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.While_loopContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.While_loopContext,i)


        def arithmetic_operation(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Arithmetic_operationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Arithmetic_operationContext,i)


        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.SEMICOLON)
            else:
                return self.getToken(CppGrammarParser.SEMICOLON, i)

        def if_statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.If_statementContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.If_statementContext,i)


        def function_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Function_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Function_callContext,i)


        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,i)


        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.AssignContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.AssignContext,i)


        def enum_namespace_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Enum_namespace_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,i)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def RETURN(self):
            return self.getToken(CppGrammarParser.RETURN, 0)

        def INT_LITERAL(self):
            return self.getToken(CppGrammarParser.INT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(CppGrammarParser.CHAR_LITERAL, 0)

        def DOUBLE_LITERAL(self):
            return self.getToken(CppGrammarParser.DOUBLE_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(CppGrammarParser.FLOAT_LITERAL, 0)

        def BOOL_LITERAL(self):
            return self.getToken(CppGrammarParser.BOOL_LITERAL, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_function_scope

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_scope" ):
                listener.enterFunction_scope(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_scope" ):
                listener.exitFunction_scope(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_scope" ):
                return visitor.visitFunction_scope(self)
            else:
                return visitor.visitChildren(self)




    def function_scope(self):

        localctx = CppGrammarParser.Function_scopeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_function_scope)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 406
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 13007832) != 0) or _la==77:
                self.state = 404
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,70,self._ctx)
                if la_ == 1:
                    self.state = 392
                    self.for_loop()
                    pass

                elif la_ == 2:
                    self.state = 393
                    self.while_loop()
                    pass

                elif la_ == 3:
                    self.state = 394
                    self.arithmetic_operation()
                    self.state = 395
                    self.match(CppGrammarParser.SEMICOLON)
                    pass

                elif la_ == 4:
                    self.state = 397
                    self.if_statement()
                    pass

                elif la_ == 5:
                    self.state = 398
                    self.function_call()
                    pass

                elif la_ == 6:
                    self.state = 399
                    self.variable_declaration()
                    pass

                elif la_ == 7:
                    self.state = 400
                    self.assign()
                    pass

                elif la_ == 8:
                    self.state = 401
                    self.enum_namespace_call()
                    self.state = 402
                    self.match(CppGrammarParser.ID)
                    pass


                self.state = 408
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 418
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==21:
                self.state = 409
                self.match(CppGrammarParser.RETURN)
                self.state = 415
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [77]:
                    self.state = 411
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,72,self._ctx)
                    if la_ == 1:
                        self.state = 410
                        self.enum_namespace_call()


                    self.state = 413
                    self.match(CppGrammarParser.ID)
                    pass
                elif token in [38, 78, 79, 80, 81]:
                    self.state = 414
                    _la = self._input.LA(1)
                    if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    pass
                elif token in [66]:
                    pass
                else:
                    pass
                self.state = 417
                self.match(CppGrammarParser.SEMICOLON)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def LEFT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, 0)

        def RIGHT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0)

        def enum_namespace_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Enum_namespace_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.COMMA)
            else:
                return self.getToken(CppGrammarParser.COMMA, i)

        def INT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.INT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.INT_LITERAL, i)

        def CHAR_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.CHAR_LITERAL)
            else:
                return self.getToken(CppGrammarParser.CHAR_LITERAL, i)

        def DOUBLE_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.DOUBLE_LITERAL)
            else:
                return self.getToken(CppGrammarParser.DOUBLE_LITERAL, i)

        def FLOAT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.FLOAT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.FLOAT_LITERAL, i)

        def BOOL_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.BOOL_LITERAL)
            else:
                return self.getToken(CppGrammarParser.BOOL_LITERAL, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_function_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_call" ):
                listener.enterFunction_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_call" ):
                listener.exitFunction_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_call" ):
                return visitor.visitFunction_call(self)
            else:
                return visitor.visitChildren(self)




    def function_call(self):

        localctx = CppGrammarParser.Function_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_function_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 421
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,75,self._ctx)
            if la_ == 1:
                self.state = 420
                self.enum_namespace_call()


            self.state = 423
            self.match(CppGrammarParser.ID)
            self.state = 424
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 430
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [77]:
                self.state = 426
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,76,self._ctx)
                if la_ == 1:
                    self.state = 425
                    self.enum_namespace_call()


                self.state = 428
                self.match(CppGrammarParser.ID)
                pass
            elif token in [38, 78, 79, 80, 81]:
                self.state = 429
                _la = self._input.LA(1)
                if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            elif token in [69, 76]:
                pass
            else:
                pass
            self.state = 439
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==76:
                self.state = 432
                self.match(CppGrammarParser.COMMA)
                self.state = 435
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [77]:
                    self.state = 433
                    self.match(CppGrammarParser.ID)
                    pass
                elif token in [38, 78, 79, 80, 81]:
                    self.state = 434
                    _la = self._input.LA(1)
                    if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 441
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 442
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(CppGrammarParser.FOR, 0)

        def LEFT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, 0)

        def if_expression(self):
            return self.getTypedRuleContext(CppGrammarParser.If_expressionContext,0)


        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.SEMICOLON)
            else:
                return self.getToken(CppGrammarParser.SEMICOLON, i)

        def arithmetic_operation(self):
            return self.getTypedRuleContext(CppGrammarParser.Arithmetic_operationContext,0)


        def RIGHT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def loop_scope(self):
            return self.getTypedRuleContext(CppGrammarParser.Loop_scopeContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def variable_declaration(self):
            return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,0)


        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def assign(self):
            return self.getTypedRuleContext(CppGrammarParser.AssignContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_for_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_loop" ):
                listener.enterFor_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_loop" ):
                listener.exitFor_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_loop" ):
                return visitor.visitFor_loop(self)
            else:
                return visitor.visitChildren(self)




    def for_loop(self):

        localctx = CppGrammarParser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_for_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 444
            self.match(CppGrammarParser.FOR)
            self.state = 445
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 450
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,80,self._ctx)
            if la_ == 1:
                self.state = 446
                self.variable_declaration()
                pass

            elif la_ == 2:
                self.state = 447
                self.match(CppGrammarParser.ID)
                self.state = 448
                self.match(CppGrammarParser.SEMICOLON)
                pass

            elif la_ == 3:
                self.state = 449
                self.assign()
                pass


            self.state = 452
            self.if_expression()
            self.state = 453
            self.match(CppGrammarParser.SEMICOLON)
            self.state = 454
            self.arithmetic_operation()
            self.state = 455
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
            self.state = 456
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 457
            self.loop_scope()
            self.state = 458
            self.match(CppGrammarParser.RIGHT_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Loop_scopeContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def for_loop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.For_loopContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.For_loopContext,i)


        def while_loop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.While_loopContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.While_loopContext,i)


        def BREAK(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.BREAK)
            else:
                return self.getToken(CppGrammarParser.BREAK, i)

        def SEMICOLON(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.SEMICOLON)
            else:
                return self.getToken(CppGrammarParser.SEMICOLON, i)

        def CONTINUE(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.CONTINUE)
            else:
                return self.getToken(CppGrammarParser.CONTINUE, i)

        def arithmetic_operation(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Arithmetic_operationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Arithmetic_operationContext,i)


        def if_statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.If_statementContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.If_statementContext,i)


        def variable_declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Variable_declarationContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Variable_declarationContext,i)


        def assign(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.AssignContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.AssignContext,i)


        def function_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Function_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Function_callContext,i)


        def RETURN(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.RETURN)
            else:
                return self.getToken(CppGrammarParser.RETURN, i)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def enum_namespace_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Enum_namespace_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,i)


        def INT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.INT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.INT_LITERAL, i)

        def CHAR_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.CHAR_LITERAL)
            else:
                return self.getToken(CppGrammarParser.CHAR_LITERAL, i)

        def DOUBLE_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.DOUBLE_LITERAL)
            else:
                return self.getToken(CppGrammarParser.DOUBLE_LITERAL, i)

        def FLOAT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.FLOAT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.FLOAT_LITERAL, i)

        def BOOL_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.BOOL_LITERAL)
            else:
                return self.getToken(CppGrammarParser.BOOL_LITERAL, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_loop_scope

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLoop_scope" ):
                listener.enterLoop_scope(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLoop_scope" ):
                listener.exitLoop_scope(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLoop_scope" ):
                return visitor.visitLoop_scope(self)
            else:
                return visitor.visitChildren(self)




    def loop_scope(self):

        localctx = CppGrammarParser.Loop_scopeContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_loop_scope)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 489
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 16677848) != 0) or _la==66 or _la==77:
                self.state = 485
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,84,self._ctx)
                if la_ == 1:
                    self.state = 460
                    self.for_loop()
                    pass

                elif la_ == 2:
                    self.state = 461
                    self.while_loop()
                    pass

                elif la_ == 3:
                    self.state = 462
                    self.match(CppGrammarParser.BREAK)
                    self.state = 463
                    self.match(CppGrammarParser.SEMICOLON)
                    pass

                elif la_ == 4:
                    self.state = 464
                    self.match(CppGrammarParser.CONTINUE)
                    self.state = 465
                    self.match(CppGrammarParser.SEMICOLON)
                    pass

                elif la_ == 5:
                    self.state = 466
                    self.arithmetic_operation()
                    self.state = 467
                    self.match(CppGrammarParser.SEMICOLON)
                    pass

                elif la_ == 6:
                    self.state = 469
                    self.if_statement()
                    pass

                elif la_ == 7:
                    self.state = 470
                    self.variable_declaration()
                    pass

                elif la_ == 8:
                    self.state = 471
                    self.assign()
                    pass

                elif la_ == 9:
                    self.state = 472
                    self.function_call()
                    pass

                elif la_ == 10:
                    self.state = 473
                    self.match(CppGrammarParser.RETURN)
                    self.state = 479
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,82,self._ctx)
                    if la_ == 1:
                        self.state = 475
                        self._errHandler.sync(self)
                        la_ = self._interp.adaptivePredict(self._input,81,self._ctx)
                        if la_ == 1:
                            self.state = 474
                            self.enum_namespace_call()


                        self.state = 477
                        self.match(CppGrammarParser.ID)

                    elif la_ == 2:
                        self.state = 478
                        _la = self._input.LA(1)
                        if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                            self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()


                    pass

                elif la_ == 11:
                    self.state = 482
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if _la==77:
                        self.state = 481
                        self.enum_namespace_call()


                    self.state = 484
                    self.match(CppGrammarParser.SEMICOLON)
                    pass


                self.state = 491
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(CppGrammarParser.WHILE, 0)

        def LEFT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, 0)

        def if_expression(self):
            return self.getTypedRuleContext(CppGrammarParser.If_expressionContext,0)


        def RIGHT_PARENTHESIS(self):
            return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, 0)

        def LEFT_BRACKET(self):
            return self.getToken(CppGrammarParser.LEFT_BRACKET, 0)

        def loop_scope(self):
            return self.getTypedRuleContext(CppGrammarParser.Loop_scopeContext,0)


        def RIGHT_BRACKET(self):
            return self.getToken(CppGrammarParser.RIGHT_BRACKET, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_loop" ):
                return visitor.visitWhile_loop(self)
            else:
                return visitor.visitChildren(self)




    def while_loop(self):

        localctx = CppGrammarParser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_while_loop)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 492
            self.match(CppGrammarParser.WHILE)
            self.state = 493
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 494
            self.if_expression()
            self.state = 495
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
            self.state = 496
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 497
            self.loop_scope()
            self.state = 498
            self.match(CppGrammarParser.RIGHT_BRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_expressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def inside_if(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Inside_ifContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Inside_ifContext,i)


        def LOG_NOT(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LOG_NOT)
            else:
                return self.getToken(CppGrammarParser.LOG_NOT, i)

        def LEFT_PARENTHESIS(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LEFT_PARENTHESIS)
            else:
                return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, i)

        def RIGHT_PARENTHESIS(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.RIGHT_PARENTHESIS)
            else:
                return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, i)

        def LOG_AND(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LOG_AND)
            else:
                return self.getToken(CppGrammarParser.LOG_AND, i)

        def LOG_OR(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LOG_OR)
            else:
                return self.getToken(CppGrammarParser.LOG_OR, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_if_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_expression" ):
                listener.enterIf_expression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_expression" ):
                listener.exitIf_expression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_expression" ):
                return visitor.visitIf_expression(self)
            else:
                return visitor.visitChildren(self)




    def if_expression(self):

        localctx = CppGrammarParser.If_expressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_if_expression)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 506
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [38, 77, 78, 79, 80, 81]:
                self.state = 500
                self.inside_if()
                pass
            elif token in [56]:
                self.state = 501
                self.match(CppGrammarParser.LOG_NOT)
                self.state = 502
                self.match(CppGrammarParser.LEFT_PARENTHESIS)
                self.state = 503
                self.inside_if()
                self.state = 504
                self.match(CppGrammarParser.RIGHT_PARENTHESIS)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 519
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==54 or _la==55:
                self.state = 508
                _la = self._input.LA(1)
                if not(_la==54 or _la==55):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 515
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [38, 77, 78, 79, 80, 81]:
                    self.state = 509
                    self.inside_if()
                    pass
                elif token in [56]:
                    self.state = 510
                    self.match(CppGrammarParser.LOG_NOT)
                    self.state = 511
                    self.match(CppGrammarParser.LEFT_PARENTHESIS)
                    self.state = 512
                    self.inside_if()
                    self.state = 513
                    self.match(CppGrammarParser.RIGHT_PARENTHESIS)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 521
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Inside_ifContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def INT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.INT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.INT_LITERAL, i)

        def CHAR_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.CHAR_LITERAL)
            else:
                return self.getToken(CppGrammarParser.CHAR_LITERAL, i)

        def DOUBLE_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.DOUBLE_LITERAL)
            else:
                return self.getToken(CppGrammarParser.DOUBLE_LITERAL, i)

        def FLOAT_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.FLOAT_LITERAL)
            else:
                return self.getToken(CppGrammarParser.FLOAT_LITERAL, i)

        def BOOL_LITERAL(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.BOOL_LITERAL)
            else:
                return self.getToken(CppGrammarParser.BOOL_LITERAL, i)

        def LESSER(self):
            return self.getToken(CppGrammarParser.LESSER, 0)

        def LESSER_EQUAL(self):
            return self.getToken(CppGrammarParser.LESSER_EQUAL, 0)

        def GREATER(self):
            return self.getToken(CppGrammarParser.GREATER, 0)

        def GREATER_EQUAL(self):
            return self.getToken(CppGrammarParser.GREATER_EQUAL, 0)

        def EQUAL(self):
            return self.getToken(CppGrammarParser.EQUAL, 0)

        def NONEQUAL(self):
            return self.getToken(CppGrammarParser.NONEQUAL, 0)

        def enum_namespace_call(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Enum_namespace_callContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,i)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_inside_if

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterInside_if" ):
                listener.enterInside_if(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitInside_if" ):
                listener.exitInside_if(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitInside_if" ):
                return visitor.visitInside_if(self)
            else:
                return visitor.visitChildren(self)




    def inside_if(self):

        localctx = CppGrammarParser.Inside_ifContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_inside_if)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 527
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [77]:
                self.state = 523
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,89,self._ctx)
                if la_ == 1:
                    self.state = 522
                    self.enum_namespace_call()


                self.state = 525
                self.match(CppGrammarParser.ID)
                pass
            elif token in [38, 78, 79, 80, 81]:
                self.state = 526
                _la = self._input.LA(1)
                if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass
            else:
                raise NoViableAltException(self)

            self.state = 537
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 17732923532771328) != 0):
                self.state = 529
                _la = self._input.LA(1)
                if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 17732923532771328) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                self.state = 535
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [77]:
                    self.state = 531
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,91,self._ctx)
                    if la_ == 1:
                        self.state = 530
                        self.enum_namespace_call()


                    self.state = 533
                    self.match(CppGrammarParser.ID)
                    pass
                elif token in [38, 78, 79, 80, 81]:
                    self.state = 534
                    _la = self._input.LA(1)
                    if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                        self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    pass
                else:
                    raise NoViableAltException(self)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class If_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(CppGrammarParser.IF, 0)

        def LEFT_PARENTHESIS(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LEFT_PARENTHESIS)
            else:
                return self.getToken(CppGrammarParser.LEFT_PARENTHESIS, i)

        def if_expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.If_expressionContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.If_expressionContext,i)


        def RIGHT_PARENTHESIS(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.RIGHT_PARENTHESIS)
            else:
                return self.getToken(CppGrammarParser.RIGHT_PARENTHESIS, i)

        def LEFT_BRACKET(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.LEFT_BRACKET)
            else:
                return self.getToken(CppGrammarParser.LEFT_BRACKET, i)

        def loop_scope(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(CppGrammarParser.Loop_scopeContext)
            else:
                return self.getTypedRuleContext(CppGrammarParser.Loop_scopeContext,i)


        def RIGHT_BRACKET(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.RIGHT_BRACKET)
            else:
                return self.getToken(CppGrammarParser.RIGHT_BRACKET, i)

        def ELSE_IF(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ELSE_IF)
            else:
                return self.getToken(CppGrammarParser.ELSE_IF, i)

        def ELSE(self):
            return self.getToken(CppGrammarParser.ELSE, 0)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_if_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIf_statement" ):
                listener.enterIf_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIf_statement" ):
                listener.exitIf_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitIf_statement" ):
                return visitor.visitIf_statement(self)
            else:
                return visitor.visitChildren(self)




    def if_statement(self):

        localctx = CppGrammarParser.If_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_if_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 539
            self.match(CppGrammarParser.IF)
            self.state = 540
            self.match(CppGrammarParser.LEFT_PARENTHESIS)
            self.state = 541
            self.if_expression()
            self.state = 542
            self.match(CppGrammarParser.RIGHT_PARENTHESIS)
            self.state = 543
            self.match(CppGrammarParser.LEFT_BRACKET)
            self.state = 544
            self.loop_scope()
            self.state = 545
            self.match(CppGrammarParser.RIGHT_BRACKET)
            self.state = 556
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==16:
                self.state = 546
                self.match(CppGrammarParser.ELSE_IF)
                self.state = 547
                self.match(CppGrammarParser.LEFT_PARENTHESIS)
                self.state = 548
                self.if_expression()
                self.state = 549
                self.match(CppGrammarParser.RIGHT_PARENTHESIS)
                self.state = 550
                self.match(CppGrammarParser.LEFT_BRACKET)
                self.state = 551
                self.loop_scope()
                self.state = 552
                self.match(CppGrammarParser.RIGHT_BRACKET)
                self.state = 558
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 564
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==15:
                self.state = 559
                self.match(CppGrammarParser.ELSE)
                self.state = 560
                self.match(CppGrammarParser.LEFT_BRACKET)
                self.state = 561
                self.loop_scope()
                self.state = 562
                self.match(CppGrammarParser.RIGHT_BRACKET)


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Enum_namespace_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.ID)
            else:
                return self.getToken(CppGrammarParser.ID, i)

        def SCOPE_RESOLUTION(self, i:int=None):
            if i is None:
                return self.getTokens(CppGrammarParser.SCOPE_RESOLUTION)
            else:
                return self.getToken(CppGrammarParser.SCOPE_RESOLUTION, i)

        def getRuleIndex(self):
            return CppGrammarParser.RULE_enum_namespace_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterEnum_namespace_call" ):
                listener.enterEnum_namespace_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitEnum_namespace_call" ):
                listener.exitEnum_namespace_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitEnum_namespace_call" ):
                return visitor.visitEnum_namespace_call(self)
            else:
                return visitor.visitChildren(self)




    def enum_namespace_call(self):

        localctx = CppGrammarParser.Enum_namespace_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_enum_namespace_call)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 566
            self.match(CppGrammarParser.ID)
            self.state = 567
            self.match(CppGrammarParser.SCOPE_RESOLUTION)
            self.state = 572
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,96,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    self.state = 568
                    self.match(CppGrammarParser.ID)
                    self.state = 569
                    self.match(CppGrammarParser.SCOPE_RESOLUTION) 
                self.state = 574
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,96,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Arithmetic_operationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def INCREMENT(self):
            return self.getToken(CppGrammarParser.INCREMENT, 0)

        def DECREMENT(self):
            return self.getToken(CppGrammarParser.DECREMENT, 0)

        def ASSIGN_ADD(self):
            return self.getToken(CppGrammarParser.ASSIGN_ADD, 0)

        def ASSIGN_SUBSTRACT(self):
            return self.getToken(CppGrammarParser.ASSIGN_SUBSTRACT, 0)

        def ASSIGN_MULTIPLY(self):
            return self.getToken(CppGrammarParser.ASSIGN_MULTIPLY, 0)

        def ASSIGN_DIVIDE(self):
            return self.getToken(CppGrammarParser.ASSIGN_DIVIDE, 0)

        def assingment_options(self):
            return self.getTypedRuleContext(CppGrammarParser.Assingment_optionsContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_arithmetic_operation

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArithmetic_operation" ):
                listener.enterArithmetic_operation(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArithmetic_operation" ):
                listener.exitArithmetic_operation(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArithmetic_operation" ):
                return visitor.visitArithmetic_operation(self)
            else:
                return visitor.visitChildren(self)




    def arithmetic_operation(self):

        localctx = CppGrammarParser.Arithmetic_operationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_arithmetic_operation)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 575
            self.match(CppGrammarParser.ID)
            self.state = 586
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [41]:
                self.state = 576
                self.match(CppGrammarParser.INCREMENT)
                pass
            elif token in [42]:
                self.state = 577
                self.match(CppGrammarParser.DECREMENT)
                pass
            elif token in [58]:
                self.state = 578
                self.match(CppGrammarParser.ASSIGN_ADD)

                self.state = 579
                self.assingment_options()
                pass
            elif token in [59]:
                self.state = 580
                self.match(CppGrammarParser.ASSIGN_SUBSTRACT)

                self.state = 581
                self.assingment_options()
                pass
            elif token in [60]:
                self.state = 582
                self.match(CppGrammarParser.ASSIGN_MULTIPLY)

                self.state = 583
                self.assingment_options()
                pass
            elif token in [61]:
                self.state = 584
                self.match(CppGrammarParser.ASSIGN_DIVIDE)

                self.state = 585
                self.assingment_options()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Assingment_optionsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(CppGrammarParser.ID, 0)

        def enum_namespace_call(self):
            return self.getTypedRuleContext(CppGrammarParser.Enum_namespace_callContext,0)


        def INT_LITERAL(self):
            return self.getToken(CppGrammarParser.INT_LITERAL, 0)

        def CHAR_LITERAL(self):
            return self.getToken(CppGrammarParser.CHAR_LITERAL, 0)

        def DOUBLE_LITERAL(self):
            return self.getToken(CppGrammarParser.DOUBLE_LITERAL, 0)

        def FLOAT_LITERAL(self):
            return self.getToken(CppGrammarParser.FLOAT_LITERAL, 0)

        def BOOL_LITERAL(self):
            return self.getToken(CppGrammarParser.BOOL_LITERAL, 0)

        def function_call(self):
            return self.getTypedRuleContext(CppGrammarParser.Function_callContext,0)


        def getRuleIndex(self):
            return CppGrammarParser.RULE_assingment_options

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssingment_options" ):
                listener.enterAssingment_options(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssingment_options" ):
                listener.exitAssingment_options(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssingment_options" ):
                return visitor.visitAssingment_options(self)
            else:
                return visitor.visitChildren(self)




    def assingment_options(self):

        localctx = CppGrammarParser.Assingment_optionsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_assingment_options)
        self._la = 0 # Token type
        try:
            self.state = 594
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,99,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 589
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,98,self._ctx)
                if la_ == 1:
                    self.state = 588
                    self.enum_namespace_call()


                self.state = 591
                self.match(CppGrammarParser.ID)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 592
                _la = self._input.LA(1)
                if not(((((_la - 38)) & ~0x3f) == 0 and ((1 << (_la - 38)) & 16492674416641) != 0)):
                    self._errHandler.recoverInline(self)
                else:
                    self._errHandler.reportMatch(self)
                    self.consume()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 593
                self.function_call()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





