# Currency Converter

A Java-based currency converter application that provides real-time exchange rates using the FreeCurrencyAPI service.

## Features

- Real-time currency conversion
- Multiple currency support
- Clean and intuitive user interface
- Powered by FreeCurrencyAPI for accurate exchange rates

## Prerequisites

- Java Development Kit (JDK) 21 or higher
- Maven or Gradle (depending on your build system)
- FreeCurrencyAPI key (free registration at [freecurrencyapi.com](https://freecurrencyapi.com))

## Setup

### 1. Clone the Repository

```bash
git clone https://github.com/SelectND/currency-conv-ui.git
cd currency-conv-ui
```

### 2. API Key Configuration

Before running the application, you need to create an `ApiKeys.java` file in the `src/main/java/me/valentinkoenig/currencyconvui/` directory:

```java
package me.valentinkoenig.currencyconvui;

public class ApiKeys {
    static final String FREECURRENCYAPI_KEY = "YOUR API KEY";
}
```

**Important:** Replace `"YOUR API KEY"` with your actual FreeCurrencyAPI key. You can obtain a free API key by registering at [freecurrencyapi.com](https://freecurrencyapi.com).

### 3. Build and Run

Simply build the project using your preferred build tool

## Usage

1. Launch the application
2. Select the source currency from the dropdown menu
3. Enter the amount you want to convert
4. Select the target currency
5. Click "Convert" to get the real-time exchange rate and converted amount

## API Information

This application uses the FreeCurrencyAPI service to fetch real-time exchange rates. The API provides:

- Up-to-date exchange rates
- Support for multiple currencies
- Reliable and fast response times

## Security Note

The `ApiKeys.java` file is included in `.gitignore` to prevent accidental exposure of your API key. Never commit your actual API key to version control.

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- [FreeCurrencyAPI](https://freecurrencyapi.com) for providing the exchange rate data
- Contributors and maintainers of this project

## Support

If you encounter any issues or have questions, please open an issue on the GitHub repository.

---

**Note:** Make sure to keep your API key secure and never share it publicly. The free tier of FreeCurrencyAPI has usage limits, so consider upgrading if you need higher request volumes.
