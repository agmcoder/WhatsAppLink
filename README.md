# WhatsAppLink (Kotlin Multiplatform)

A **Kotlin Multiplatform Mobile (KMM)** experiment exploring shared business logic between iOS and Android, built around the same idea as [`WhatsAppLink_SwiftUI`](https://github.com/agmcoder/WhatsAppLink_SwiftUI): opening a WhatsApp chat without saving the contact first.

## Project structure

```
shared/              # Kotlin Multiplatform shared module (common/android/iOS source sets)
WhatsAppLinkAndroid/  # Android app (Jetpack Compose)
WhatAppLinkIOS/       # iOS app (SwiftUI)
```

## Status

Early-stage KMM scaffolding — shared module and both app shells exist, business logic is still minimal. See `WhatsAppLink_SwiftUI` for the finished, native SwiftUI implementation.

## Tech stack

Kotlin Multiplatform · Jetpack Compose · SwiftUI
