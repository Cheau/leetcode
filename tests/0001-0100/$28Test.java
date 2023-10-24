import test.AbstractTest;
import test.ext.check.Result;
import org.junit.jupiter.api.Test;

class $28Test extends AbstractTest implements Result {

    @Test
    void test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        super.test(0, haystack, needle);
    }

    @Test
    void test2() {
        String haystack = "leetcode";
        String needle = "leeto";
        super.test(-1, haystack, needle);
    }

    @Test
    void test3() {
        String haystack = "a";
        String needle = "a";
        super.test(0, haystack, needle);
    }

    @Test
    void test4() {
        String haystack = "mississippi";
        String needle = "issip";
        super.test(4, haystack, needle);
    }

    @Test
    void test5() {
        String haystack = "aabaaabaaac";
        String needle = "aabaaac";
        super.test(4, haystack, needle);
    }

    @Test
    void test6() {
        String haystack = "babbbbbabb";
        String needle = "bbab";
        super.test(5, haystack, needle);
    }

    @Test
    void test7() {
        String haystack = "ababaabbbbababbaabaaabaabbaaaabbabaabbbbbbabbaabbabbbabbbbbaaabaababbbaabbbabbbaabbbbaaabbababbabbbabaaabbaabbabababbbaaaaaaababbabaababaabbbbaaabbbabb";
        String needle = "abbabbbabaa";
        super.test(92, haystack, needle);
    }
}