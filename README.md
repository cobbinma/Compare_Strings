# Compare_Strings

TEST RULES

1. Write the solution code in your style, using (in order of preference)
a. Ruby, Go, C++, Python or Java.
2. DO NOT use built-in language functionality to directly solve the problem
(thereby making the solution trivial). For example:
a. do not use the built-in pattern matching functionality such as: split,
include?, sub, match or any other regular expression method and
language facilities. However; your solution may implement these methods
from scratch in which case those are OK
3. You may use the String Class (or appropriate for your language) for storage. And
you may use String Methods NOT associated with searching or matching.
4. You may choose any means of accepting input and producing output, including
the use of a test harness.
5. This test has no time limit – take as long as you need to ensure that you’re
presenting the best solution you can; code style, readability, comments and
structure will all be evaluated (assuming it all works too of course!)
6. Lastly: Remember that we will run your submission against our own additional
set of test criteria; not just the ones shown here! Your code should be
generalised to work against any inputs, and handle errors appropriately.

QUESTION
Write an application that fulfils the following requirements:
1. Accept two strings as input:
a. one string is called text
b. the other is called subtext
2. Match the subtext against the text; outputting the character positions of the
beginning of each match for the subtext within the text
3. Multiple matches are allowed
4. Matching is case-insensitive

ACCEPTANCE CRITERIA
Given the following input:
TEXT: Polly put the kettle on, polly put the kettle on, polly put the kettle on we'll all have tea
We expect the following results:
SUBTEXT: Polly OUTPUT: 1, 26, 51
SUBTEXT: polly OUTPUT: 1, 26, 51
SUBTEXT: ll    OUTPUT: 3, 28, 53, 78, 82
SUBTEXT: Ll    OUTPUT: 3, 28, 53, 78, 82
SUBTEXT: X     OUTPUT: <no matches>
SUBTEXT: Polx  OUTPUT: <no matches>
