package com.example.appsearch

data class TodoListState(
    val todos: List<Todo> = emptyList(),
    val searchQuery: String = ""
)
