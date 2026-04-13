# Spin-Doctor Vintage 
### *Precision Restoration for the Golden Era of Steel*

Spin-Doctor Vintage is a boutique digital storefront built for a high-end bicycle restoration shop specializing in 1970s and 1980s racing frames. This project utilizes **Jetpack Compose for Web (Compose HTML)** to deliver a responsive, visually distinct landing page with a retro-industrial aesthetic.

##  Tech Stack
- **Framework**: [Compose HTML](https://github.com/JetBrains/compose-multiplatform) (Vanilla)
- **Language**: Kotlin Multiplatform (JS Target)
- **Styling**: Type-safe CSS-in-Kotlin (StyleSheets)
- **Deployment**: [Insert your link: e.g., GitHub Pages / Netlify]

## Design Philosophy: "Retro-Industrial"
The site is engineered to evoke the tactile feel of a vintage workshop:
- **Palette**: Racing Green (#1B4D3E), Chrome Silver (#C0C0C0), and Rust Orange (#B7410E).
- **Typography**: Industrial sans-serifs (Bebas Neue) paired with typewriter-style monospaced fonts (Courier Prime).
- **Aesthetic**: Chrome accents, dashed borders reminiscent of shop tickets, and a high-contrast dark-mode hero section.

## Key Sections
1. **Hero Header**: High-impact brand introduction and mission statement.
2. **Currently on the Stand**: A responsive grid showcasing current restoration projects (e.g., 1974 Raleigh, 1982 Colnago). 
3. **Service Menu**: A flat-rate restoration log detailing professional tuning and overhauls.
4. **Contact Footer**: Shop hours and integrated booking links.

## Responsiveness
The layout utilizes a "mobile-first" approach with dynamic grid scaling. 
- **Desktop**: 3-column restoration gallery and horizontal service rows.
- **Mobile**: Stacks components vertically using `gridTemplateColumns("repeat(auto-fit, ...)")` for an elegant reading experience on all device sizes.

## Getting Started

### Prerequisites
- Android Studio (Iguana or newer)
- JDK 17+

### Running Locally
1. Clone the repository:
   ```bash
   git clone [https://github.com/Ya-Red7/Spin-Doctor-Vintage.git](https://github.com/Ya-Red7/Spin-Doctor-Vintage.git)
   ```
2. Open the project in Android Studio.
3. Run the development server (with hot-reload):
   ```bash
   ./gradlew :composeApp:jsBrowserDevelopmentRun --continuous
   ```
4. Access the site at `http://localhost:8080`.

### Building for Production
To generate the optimized JavaScript bundle:
```bash
./gradlew :composeApp:jsBrowserProductionLibraryDistribution
```
The output will be located in `composeApp/build/dist/js/productionExecutable/`.

## Project Structure
```text
composeApp/
├── src/jsMain/
│   ├── kotlin/
│   │   └── com.spindoctor.vintage/
│   │       ├── components/    # Reusable UI molecules (BikeCard, ServiceItem)
│   │       ├── sections/      # Large page organisms (Hero, Grid, Footer)
│   │       ├── theme/         # Type-safe CSS & Branding
│   │       └── Main.kt        # Entry point
│   └── resources/             # Static assets (index.html, images, global css)
```


---
