package io.imrekaszab.githubuserfinder.di

import io.imrekaszab.githubuserfinder.action.GitHubUserAction
import io.imrekaszab.githubuserfinder.service.GitHubUserService
import io.imrekaszab.githubuserfinder.store.GitHubUserStore
import org.koin.dsl.module

var dataModule = module {
    single<GitHubUserAction> { GitHubUserService() }
    single<GitHubUserStore> { GitHubUserService() }
}
