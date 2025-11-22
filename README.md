# Play Store Nested List UI Demo

This Android application demonstrates a nested list interface similar to the Google Play Store. It features a vertical list of categories, where each category contains a horizontal list of application items.

## Features

-   **Nested RecyclerViews**: Implements a vertical `RecyclerView` for categories and horizontal `RecyclerViews` for app items.
-   **Custom Layouts**: Uses custom XML layouts for app cards and category headers.
-   **Dummy Data**: Generates sample data to visualize the UI structure.
-   **Clean Architecture**: Separates data models (`AppItem`, `Category`), adapters, and UI logic.

## Screenshots

*(Add screenshots here if available)*

## Getting Started

### Prerequisites

-   Android Studio Ladybug or newer.
-   JDK 17 or newer (bundled with Android Studio).
-   Android SDK 34.

### Installation

1.  Clone the repository:
    ```bash
    git clone https://github.com/yourusername/your-repo-name.git
    ```
2.  Open the project in Android Studio.
3.  Sync Gradle files.
4.  Run the application on an emulator or physical device.

## Build Configuration

-   **Gradle Plugin**: 8.3.1
-   **Kotlin**: 2.0.21
-   **Compile SDK**: 34
-   **Target SDK**: 34
-   **Min SDK**: 24

## License

This project is open source and available under the [MIT License](LICENSE).
