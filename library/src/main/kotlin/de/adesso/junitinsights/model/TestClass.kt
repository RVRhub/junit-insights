package de.adesso.junitinsights.model

/**
 * Data class for a test class.
 * Includes summarized time-spans and a collection of TestMethod objects associated with this test class.
 * Used in Report class
 * @see Report
 */
data class TestClass(
        var name: String,
        var firstTimestamp: Long,
        var methods: List<TestMethod>,
        var beforeAll: Long,
        var before: Long,
        var exec: Long,
        var after: Long,
        var afterAll: Long,
        var between: Long,
        var spring: Long,
        var springContextCount: Int,
        var springContextNames: String? = null
)