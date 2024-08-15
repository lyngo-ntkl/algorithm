package com.lyngo.dsa_practice.algorithms.string_matching;

import org.junit.jupiter.api.BeforeAll;

public class BoyerMooreMajorityVotingTest {
    private BoyerMooreMajorityVoting boyerMooreMajorityVoting;

    @BeforeAll
    public void setUp() {
        boyerMooreMajorityVoting = new BoyerMooreMajorityVoting();
    }

    // @ParameterizedTest
    // @MethodSource("generateData")
    // public void findMajorityValue_integer_returnsMajorityValue(Integer[] array) {
    //     int actual = boyerMooreMajorityVoting.findMajorityValue(array);
    //     int expected = boyerMooreMajorityVoting.findMajorityValueSlow(array);
    //     assertEquals(expected, actual);
    // }

    // public Stream<Arguments> generateData() {
    //     return Stream.of(
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, ),
    //         Arguments.of(new Integer[] {}, )
    //     );
    // }
}