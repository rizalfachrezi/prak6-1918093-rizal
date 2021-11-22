package com.example.bab6_1918093;

import androidx.annotation.NonNull;
import androidx.work.ListenableWorker;

public interface doWork {
    @NonNull
    ListenableWorker.Result doWork();
}
