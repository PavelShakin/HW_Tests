package com.example.di_homework

import com.example.di_homework.data.api.datasource.RemoteUserDataSourceImpl
import com.example.di_homework.data.repositories.UserRepositoryImpl
import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.verify
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Mock
    private val service: RemoteUserDataSourceImpl = Mockito.mock(RemoteUserDataSourceImpl::class.java)
    private val repo = UserRepositoryImpl(service)

    @Test
    suspend fun `is on service method call repo method called`() {
        Mockito.`when`(repo.getUsersList()).thenReturn(verify(service).loadUsersList())
    }
}
