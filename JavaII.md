# Java - Working with math, strings, patterns

Hi! I'm your first Markdown file in **StackEdit**. If you want to learn about StackEdit, you can read me. If you want to play with Markdown, you can edit me. Once you have finished with me, you can create new files by opening the **file explorer** on the left corner of the navigation bar.


## Math

|    <br>Method                   	|    <br>Description                                                                                                           	|    <br>Return Type                 	|
|---------------------------------	|------------------------------------------------------------------------------------------------------------------------------	|------------------------------------	|
|    <br>abs(x)                   	|    <br>Returns   the absolute value of x                                                                                     	|    <br>double\|float\|int\|long    	|
|    <br>acos(x)                  	|    <br>Returns   the arccosine of x, in radians                                                                              	|    <br>double                      	|
|    <br>asin(x)                  	|    <br>Returns   the arcsine of x, in radians                                                                                	|    <br>double                      	|
|    <br>atan(x)                  	|    <br>Returns   the arctangent of x as a numeric value between -PI/2 and PI/2 radians                                       	|    <br>double                      	|
|    <br>atan2(y,x)               	|    <br>Returns   the angle theta from the conversion of rectangular coordinates (x, y) to   polar coordinates (r, theta).    	|    <br>double                      	|
|    <br>cbrt(x)                  	|    <br>Returns   the cube root of x                                                                                          	|    <br>double                      	|
|    <br>ceil(x)                  	|    <br>Returns   the value of x rounded up to its nearest integer                                                            	|    <br>double                      	|
|    <br>copySign(x,   y)         	|    <br>Returns   the first floating point x with the sign of the second floating point y                                     	|    <br>double                      	|
|    <br>cos(x)                   	|    <br>Returns   the cosine of x (x is in radians)                                                                           	|    <br>double                      	|
|    <br>cosh(x)                  	|    <br>Returns   the hyperbolic cosine of a double value                                                                     	|    <br>double                      	|
|    <br>exp(x)                   	|    <br>Returns   the value of Ex                                                                                             	|    <br>double                      	|
|    <br>expm1(x)                 	|    <br>Returns   ex-1                                                                                                        	|    <br>double                      	|
|    <br>floor(x)                 	|    <br>Returns   the value of x rounded down to its nearest integer                                                          	|    <br>double                      	|
|    <br>getExponent(x)           	|    <br>Returns   the unbiased exponent used in x                                                                             	|    <br>int                         	|
|    <br>hypot(x,   y)            	|    <br>Returns   sqrt(x2+y2) without intermediate overflow or underflow                                                      	|    <br>double                      	|
|    <br>IEEEremainder(x,   y)    	|    <br>Computes   the remainder operation on x and y as prescribed by the IEEE 754 standard                                  	|    <br>double                      	|
|    <br>log(x)                   	|    <br>Returns   the natural logarithm (base E) of x                                                                         	|    <br>double                      	|
|    <br>log10(x)                 	|    <br>Returns   the base 10 logarithm of x                                                                                  	|    <br>double                      	|
|    <br>log1p(x)                 	|    <br>Returns   the natural logarithm (base E) of the sum of x and 1                                                        	|    <br>double                      	|
|    <br>max(x,   y)              	|    <br>Returns   the number with the highest value                                                                           	|    <br>double\|float\|int\|long    	|
|    <br>min(x,   y)              	|    <br>Returns   the number with the lowest value                                                                            	|    <br>double\|float\|int\|long    	|
|    <br>nextAfter(x,   y)        	|    <br>Returns   the floating point number adjacent to x in the direction of y                                               	|    <br>double\|float               	|
|    <br>nextUp(x)                	|    <br>Returns   the floating point value adjacent to x in the direction of positive infinity                                	|    <br>double\|float               	|
|    <br>pow(x,   y)              	|    <br>Returns   the value of x to the power of y                                                                            	|    <br>double                      	|
|    <br>random()                 	|    <br>Returns   a random number between 0 and 1                                                                             	|    <br>double                      	|
|    <br>round(x)                 	|    <br>Returns   the value of x rounded to its nearest integer                                                               	|    <br>int                         	|
|    <br>rint()                   	|    <br>Returns   the double value that is closest to x and equal to a mathematical integer                                   	|    <br>double                      	|
|    <br>signum(x)                	|    <br>Returns   the sign of x                                                                                               	|    <br>double                      	|
|    <br>sin(x)                   	|    <br>Returns   the sine of x (x is in radians)                                                                             	|    <br>double                      	|
|    <br>sinh(x)                  	|    <br>Returns   the hyperbolic sine of a double value                                                                       	|    <br>double                      	|
|    <br>sqrt(x)                  	|    <br>Returns   the square root of x                                                                                        	|    <br>double                      	|
|    <br>tan(x)                   	|    <br>Returns   the tangent of an angle                                                                                     	|    <br>double                      	|
|    <br>tanh(x)                  	|    <br>Returns   the hyperbolic tangent of a double value                                                                    	|    <br>double                      	|
|    <br>toDegrees(x)             	|    <br>Converts   an angle measured in radians to an approx. equivalent angle measured in   degrees                          	|    <br>double                      	|
|    <br>toRadians(x)             	|    <br>Converts   an angle measured in degrees to an approx. angle measured in radians                                       	|    <br>double                      	|
|    <br>ulp(x)                   	|    <br>Returns   the size of the unit of least precision (ulp) of x                                                          	|    <br>double\|float               	|

## Strings

|    <br>Method                   	|    <br>Description                                                                                                                 	|    <br>Return Type     	|
|---------------------------------	|------------------------------------------------------------------------------------------------------------------------------------	|------------------------	|
|    <br>charAt()                 	|    <br>Returns   the character at the specified index (position)                                                                   	|    <br>char            	|
|    <br>compareTo()              	|    <br>Compares   two strings lexicographically                                                                                    	|    <br>int             	|
|    <br>compareToIgnoreCase()    	|    <br>Compares   two strings lexicographically, ignoring case differences                                                         	|    <br>int             	|
|    <br>concat()                 	|    <br>Appends   a string to the end of another string                                                                             	|    <br>String          	|
|    <br>contains()               	|    <br>Checks   whether a string contains a sequence of characters                                                                 	|    <br>boolean         	|
|    <br>contentEquals()          	|    <br>Checks   whether a string contains the exact same sequence of characters of the   specified CharSequence or StringBuffer    	|    <br>boolean         	|
|    <br>copyValueOf()            	|    <br>Returns   a String that represents the characters of the character array                                                    	|    <br>String          	|
|    <br>endsWith()               	|    <br>Checks   whether a string ends with the specified character(s)                                                              	|    <br>boolean         	|
|    <br>equals()                 	|    <br>Compares   two strings. Returns true if the strings are equal, and false if not                                             	|    <br>boolean         	|
|    <br>equalsIgnoreCase()       	|    <br>Compares   two strings, ignoring case considerations                                                                        	|    <br>boolean         	|
|    <br>format()                 	|    <br>Returns   a formatted string using the specified locale, format string, and arguments                                       	|    <br>String          	|
|    <br>getBytes()               	|    <br>Encodes   this String into a sequence of bytes using the named charset, storing the   result into a new byte array          	|    <br>byte[]          	|
|    <br>getChars()               	|    <br>Copies   characters from a string to an array of chars                                                                      	|    <br>void            	|
|    <br>hashCode()               	|    <br>Returns   the hash code of a string                                                                                         	|    <br>int             	|
|    <br>indexOf()                	|    <br>Returns   the position of the first found occurrence of specified characters in a   string                                  	|    <br>int             	|
|    <br>intern()                 	|    <br>Returns   the canonical representation for the string object                                                                	|    <br>String          	|
|    <br>isEmpty()                	|    <br>Checks   whether a string is empty or not                                                                                   	|    <br>boolean         	|
|    <br>lastIndexOf()            	|    <br>Returns   the position of the last found occurrence of specified characters in a string                                     	|    <br>int             	|
|    <br>length()                 	|    <br>Returns   the length of a specified string                                                                                  	|    <br>int             	|
|    <br>matches()                	|    <br>Searches   a string for a match against a regular expression, and returns the matches                                       	|    <br>boolean         	|
|    <br>offsetByCodePoints()     	|    <br>Returns   the index within this String that is offset from the given index by   codePointOffset code points                 	|    <br>int             	|
|    <br>regionMatches()          	|    <br>Tests   if two string regions are equal                                                                                     	|    <br>boolean         	|
|    <br>replace()                	|    <br>Searches   a string for a specified value, and returns a new string where the specified   values are replaced               	|    <br>String          	|
|    <br>replaceFirst()           	|    <br>Replaces   the first occurrence of a substring that matches the given regular expression   with the given replacement       	|    <br>String          	|
|    <br>replaceAll()             	|    <br>Replaces   each substring of this string that matches the given regular expression with   the given replacement             	|    <br>String          	|
|    <br>split()                  	|    <br>Splits a string at the specified regex  into an array of substrings                                                         	|    <br>String[]        	|
|    <br>startsWith()             	|    <br>Checks   whether a string starts with specified characters                                                                  	|    <br>boolean         	|
|    <br>subSequence()            	|    <br>Returns   a new character sequence that is a subsequence of this sequence                                                   	|    <br>CharSequence    	|
|    <br>substring()              	|    <br>Returns   a new string which is the substring of a specified string                                                         	|    <br>String          	|
|    <br>toCharArray()            	|    <br>Converts   this string to a new character array                                                                             	|    <br>char[]          	|
|    <br>toLowerCase()            	|    <br>Converts   a string to lower case letters                                                                                   	|    <br>String          	|
|    <br>toString()               	|    <br>Returns   the value of a String object                                                                                      	|    <br>String          	|
|    <br>toUpperCase()            	|    <br>Converts   a string to upper case letters                                                                                   	|    <br>String          	|
|    <br>trim()                   	|    <br>Removes   whitespace from both ends of a string                                                                             	|    <br>String          	|
|    <br>valueOf()                	|    <br>Returns   the string representation of the specified value                                                                  	|    <br>String          	|


## RegEx

| **   RegEx Pattern Method   **                       	| **   Description   **                                                                    	|
|------------------------------------------------------	|------------------------------------------------------------------------------------------	|
|    <br>Pattern   compile(String regex)               	|    <br>Compiles   the given regular expression into a pattern.                           	|
|    <br>Pattern   compile(String regex, int flags)    	|    <br>Compiles   the given regular expression into a pattern with the given flags.      	|
|    <br>boolean   matches(String regex)               	|    <br>Returns   whether or not this string matches the given regular expression.        	|
|    <br>String[]   split(CharSequence input)          	|    <br>Splits   the given input sequence around matches of this pattern.                 	|
|    <br>String   quote(String s)                      	|    <br>Returns   a literal pattern String for the specified String s.                    	|
|    <br>Predicate   asPredicate()                     	|    <br>Creates   a predicate which can be used to match a string.                        	|
|    <br>                                              	|    <br>                                                                                  	|
| **   RegEx Matcher Method   **                       	| **   Description   **                                                                    	|
|    <br>boolean   matches()                           	|    <br>Attempts   to match the entire region against the pattern.                        	|
|    <br>boolean   find()                              	|    <br>Attempts   to find the next subsequence of the input that matches the pattern.    	|
|    <br>int   start()                                 	|    <br>Returns   the start index of the last match.                                      	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Character Class   **                            	| **   Description   **                                                                    	|
|    <br>[abc]                                         	|    <br>simple,   matches a or b, or c                                                    	|
|    <br>[\^abc]                                       	|    <br>negation,   matches everything except a, b, or c                                  	|
|    <br>[a-c]                                         	|    <br>range,   matches a or b, or c                                                     	|
|    <br>[a-c[f-h]]                                    	|    <br>union,   matches a, b, c, f, g, h                                                 	|
|    <br>[a-c&&[b-c]]                                  	|    <br>intersection,   matches b or c                                                    	|
|    <br>[a-c&&[\^b-c]]                                	|    <br>subtraction,   matches only a                                                     	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Character Class   **                            	| **   Description   **                                                                    	|
|    <br>.                                             	|    <br>Any   character                                                                   	|
|    <br>\d                                            	|    <br>A   digit: [0-9]                                                                  	|
|    <br>\D                                            	|    <br>A   non-digit: [\^0-9]                                                            	|
|    <br>\s                                            	|    <br>A   whitespace character: [ \t\n\x0B\f\r]                                         	|
|    <br>\S                                            	|    <br>A   non-whitespace character: [\^\s]                                              	|
|    <br>\w                                            	|    <br>A word   character: [a-zA-Z_0-9]                                                  	|
|    <br>\W                                            	|    <br>A   non-word character: [\^\w]                                                    	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Boundary Matcher   **                           	| **   Description   **                                                                    	|
|    <br>^                                             	|    <br>The   beginning of a line                                                         	|
|    <br>$                                             	|    <br>The   end of a line                                                               	|
|    <br>\b                                            	|    <br>A word   boundary                                                                 	|
|    <br>\B                                            	|    <br>A   non-word boundary                                                             	|
|    <br>\A                                            	|    <br>The   beginning of the input                                                      	|
|    <br>\G                                            	|    <br>The   end of the previous match                                                   	|
|    <br>\Z                                            	|    <br>The   end of the input but for the final terminator, if any.                      	|
|    <br>\z                                            	|    <br>The   end of the input                                                            	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Quantifier   **                                 	| **   Description   **                                                                    	|
|    <br>*                                             	|    <br>Matches   zero or more occurrences.                                               	|
|    <br>+                                             	|    <br>Matches   one or more occurrences.                                                	|
|    <br>?                                             	|    <br>Matches   zero or one occurrence.                                                 	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Groups and Backreferences   **                  	| **   Description   **                                                                    	|
|    <br>(...)                                         	|    <br>Matches   zero or more occurrences.                                               	|
|    <br>\N                                            	|    <br>Matches   one or more occurrences.                                                	|
|    <br>(\d\d)                                        	|    <br>Matches   zero or one occurrence.                                                 	|
|    <br>(\d\d)/\1                                     	|    <br>Two   digits repeated twice, \1 - refers to the matched group                     	|
|    <br>                                              	|    <br>                                                                                  	|
| **   Pattern Flags   **                              	| **   Description   **                                                                    	|
|    <br>Pattern.CASE_INSENSITIVE                      	|    <br>Enables   case-insensitive matching.                                              	|
|    <br>Pattern.COMMENTS                              	|    <br>Whitespace   and comments starting with # are ignored until the end of a line.    	|
|    <br>Pattern.MULTILINE                             	|    <br>One   expression can match multiple lines.                                        	|
|    <br>Pattern.DOTALL                                	|    <br>The   expression "." matches any character, including a line terminator.          	|
|    <br>Pattern.UNIX_LINES                            	|    <br>Only   the '\n' line terminator is recognized in the behavior of ., ^, and $.     	|


