package com.zeno.Zeno

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize

@JsonDeserialize
data class TestData(@JsonProperty("id") val id: Long)