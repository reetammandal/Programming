
Java Array to List:

import java.util.*;

Integer[] numbers = new Integer[] { 1, 2, 3 };
List<Integer> list = Arrays.asList(new int[] { 1, 2, 3 })

String[] array = {"a", "b", "c", "d", "e"};
List<String> list1 = new ArrayList<String>();
Collections.addAll(list1, array);

for(String text:array) {
         list2.add(text);
      }
System.out.println(list1);

List<Integer> sourceList = Arrays.asList(0, 1, 2, 3, 4, 5);
Integer[] targetArray = sourceList.toArray(new Integer[0]);

int[] ints = new int[] {1,2,3,4,5};
Arrays.stream(ints).boxed().toList();
      
// Converting List to array via scope resolution operator using streams
String[] arr = listname.stream().toArray(String[] ::new);


import java.util.regex.Matcher;
import java.util.regex.Pattern;

Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();

Expression	Description
[abc]	Find one character from the options between the brackets
[^abc]	Find one character NOT between the brackets
[0-9]	Find one character from the range 0 to 9

  
|	Find a match for any one of the patterns separated by | as in: cat|dog|fish
.	Find just one instance of any character
^	Finds a match as the beginning of a string as in: ^Hello
$	Finds a match at the end of the string as in: World$
\d	Find a digit
\s	Find a whitespace character
\b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx

Quantifier	Description
n+	Matches any string that contains at least one n
n*	Matches any string that contains zero or more occurrences of n
n?	Matches any string that contains zero or one occurrences of n
n{x}	Matches any string that contains a sequence of X n's
n{x,y}	Matches any string that contains a sequence of X to Y n's
n{x,}	Matches any string that contains a sequence of at least X n's
  
  
  HashMap<String, String> capitalCities = new HashMap<String, String>();
capitalCities.put("USA", "Washington DC");
System.out.println(capitalCities);

import java.util.ArrayList;
import java.util.Iterator;

ArrayList<String> cars  = ....
   Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());

while(it.hasNext()) {
  System.out.println(it.next());
}


String[] split(CharSequence input)	//Splits the given input sequence around matches of this pattern.
  
  
RegEx Matcher Method	Description
boolean matches()	Attempts to match the entire region against the pattern.
boolean find()	Attempts to find the next subsequence of the input that matches the pattern.
int start()	Returns the start index of the last match.
  
  
Character Class	Description
.	Any character
\d	A digit: [0-9]
\D	A non-digit: [\^0-9]
\s	A whitespace character: [ \t\n\x0B\f\r]
\S	A non-whitespace character: [\^\s]
\w	A word character: [a-zA-Z_0-9]
\W	A non-word character: [\^\w]

^	The beginning of a line
$	The end of a line
\b	A word boundary
\B	A non-word boundary
\A	The beginning of the input
\G	The end of the previous match
\Z	The end of the input but for the final terminator, if any.
\z	The end of the input


*	Matches zero or more occurrences.
+	Matches one or more occurrences.
?	Matches zero or one occurrence.
  
 (...)	Matches zero or more occurrences.
\N	Matches one or more occurrences.
(\d\d)	Matches zero or one occurrence.
(\d\d)/\1	Two digits repeated twice, \1 - refers to the matched group


Pattern.CASE_INSENSITIVE	Enables case-insensitive matching.
Pattern.COMMENTS	Whitespace and comments starting with # are ignored until the end of a line.
Pattern.MULTILINE	One expression can match multiple lines.
Pattern.DOTALL	The expression "." matches any character, including a line terminator.
Pattern.UNIX_LINES	Only the '\n' line terminator is recognized in the behavior of ., ^, and $.
  
  
  
Rest api call

URL url = new URL("http://example.com");
HttpURLConnection con = (HttpURLConnection) url.openConnection();
con.setRequestMethod("GET");

Map<String, String> parameters = new HashMap<>();
parameters.put("param1", "val");

con.setDoOutput(true);
DataOutputStream out = new DataOutputStream(con.getOutputStream());
out.writeBytes(ParameterStringBuilder.getParamsString(parameters));
out.flush();
out.close();


public class ParameterStringBuilder {
    public static String getParamsString(Map<String, String> params) 
      throws UnsupportedEncodingException{
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
          result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
          result.append("=");
          result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
          result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0
          ? resultString.substring(0, resultString.length() - 1)
          : resultString;
    }
}



con.setRequestProperty("Content-Type", "application/json");
String contentType = con.getHeaderField("Content-Type");
con.setConnectTimeout(5000);
con.setReadTimeout(5000);

String cookiesHeader = con.getHeaderField("Set-Cookie");
List<HttpCookie> cookies = HttpCookie.parse(cookiesHeader);

Optional<HttpCookie> usernameCookie = cookies.stream()
  .findAny().filter(cookie -> cookie.getName().equals("username"));
if (usernameCookie == null) {
    cookieManager.getCookieStore().add(null, new HttpCookie("username", "john"));
}


con.disconnect();
con = (HttpURLConnection) url.openConnection();

con.setRequestProperty("Cookie", 
  StringUtils.join(cookieManager.getCookieStore().getCookies(), ";"));

con.setInstanceFollowRedirects(false);

HttpUrlConnection.setFollowRedirects(false);

if (status == HttpURLConnection.HTTP_MOVED_TEMP
  || status == HttpURLConnection.HTTP_MOVED_PERM) {
    String location = con.getHeaderField("Location");
    URL newUrl = new URL(location);
    con = (HttpURLConnection) newUrl.openConnection();
}

int status = con.getResponseCode();

BufferedReader in = new BufferedReader(
  new InputStreamReader(con.getInputStream()));
String inputLine;
StringBuffer content = new StringBuffer();
while ((inputLine = in.readLine()) != null) {
    content.append(inputLine);
}
in.close();


con.disconnect();


int status = con.getResponseCode();

Reader streamReader = null;

if (status > 299) {
    streamReader = new InputStreamReader(con.getErrorStream());
} else {
    streamReader = new InputStreamReader(con.getInputStream());
}


public class FullResponseBuilder {
    public static String getFullResponse(HttpURLConnection con) throws IOException {
        StringBuilder fullResponseBuilder = new StringBuilder();

        // read status and message

        // read headers

        // read response content

        return fullResponseBuilder.toString();
    }
}


fullResponseBuilder.append(con.getResponseCode())
  .append(" ")
  .append(con.getResponseMessage())
  .append("\n");

con.getHeaderFields().entrySet().stream()
  .filter(entry -> entry.getKey() != null)
  .forEach(entry -> {
      fullResponseBuilder.append(entry.getKey()).append(": ");
      List headerValues = entry.getValue();
      Iterator it = headerValues.iterator();
      if (it.hasNext()) {
          fullResponseBuilder.append(it.next());
          while (it.hasNext()) {
              fullResponseBuilder.append(", ").append(it.next());
          }
      }
      fullResponseBuilder.append("\n");
});

