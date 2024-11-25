package com.algo.trie.w10_241128;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TrieTest {
    Trie sut = new Trie();

    @Test
    void test() throws Exception {
        sut.insert("apple");
        assertThat(sut.startsWith("apple")).isTrue();
        assertThat(sut.startsWith("apple")).isTrue();
        assertThat(sut.search("apple")).isTrue();
        assertThat(sut.search("app")).isFalse();
    }

}