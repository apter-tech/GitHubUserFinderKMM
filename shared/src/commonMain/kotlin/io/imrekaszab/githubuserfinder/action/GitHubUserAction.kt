package io.imrekaszab.githubuserfinder.action

interface GitHubUserAction {
    suspend fun searchUser(userName: String)
    suspend fun fetchNextPage()
    suspend fun refreshUserDetails(userName: String)
}
