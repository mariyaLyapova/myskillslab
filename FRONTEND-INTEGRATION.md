# Frontend Integration with Bosch Design System

This document explains how the Bosch Frontend Kit has been integrated into the MySkillsLab Spring Boot application.

## 🎯 What's Installed

- **@bosch/frontend.kit-npm@4.2.0** - Bosch Design System Frontend Kit
- **Dependencies**: All required fonts, icons, and design tokens

## 📁 File Structure

```
src/main/resources/static/
├── css/
│   └── frontend-kit.complete.css     # Complete Bosch CSS framework
├── js/
│   └── frontend-kit.js               # Bosch JavaScript components
├── fonts/
│   ├── bosch_icon.woff*              # Bosch icon fonts
│   ├── boschsans_*.woff*             # Bosch Sans font family
│   └── bosch_ui_icon*.woff*          # UI icon fonts
├── index.html                        # Your main application
├── admin.html                        # Admin interface
└── bosch-integration-example.html    # Integration example
```

## 🚀 Available npm Scripts

```bash
# Build and copy all Bosch assets to Spring Boot static resources
npm run build

# Individual copy commands
npm run copy-css          # Copy CSS files
npm run copy-js           # Copy JavaScript files
npm run copy-fonts        # Copy font files

# Development build with confirmation message
npm run dev

# Clean up copied Bosch assets
npm run clean
```

## 🔧 How to Use in Your HTML

### 1. Basic Integration

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Include Bosch Frontend Kit CSS -->
    <link rel="stylesheet" href="css/frontend-kit.complete.css">
</head>
<body>
    <!-- Your content using Bosch Design System classes -->
    <button class="bds-button bds-button--primary">Click Me</button>

    <!-- Include Bosch Frontend Kit JavaScript -->
    <script src="js/frontend-kit.js"></script>
</body>
</html>
```

### 2. Common Components

```html
<!-- Header -->
<header class="bds-header">
    <h1 class="bds-heading bds-heading--primary">MySkillsLab</h1>
</header>

<!-- Buttons -->
<button class="bds-button bds-button--primary">Primary Action</button>
<button class="bds-button bds-button--secondary">Secondary Action</button>

<!-- Cards -->
<div class="bds-card">
    <div class="bds-card__header">
        <h2 class="bds-heading bds-heading--secondary">Card Title</h2>
    </div>
    <div class="bds-card__content">
        <p class="bds-text">Card content goes here.</p>
    </div>
</div>

<!-- Forms -->
<form class="bds-form">
    <div class="bds-form__group">
        <label class="bds-label" for="input">Label</label>
        <input class="bds-input" type="text" id="input" name="input">
    </div>
</form>
```

## 🔄 Maven Integration

To automatically copy Bosch assets during Maven build, add this to your `pom.xml`:

```xml
<plugin>
    <groupId>com.github.eirslett</groupId>
    <artifactId>frontend-maven-plugin</artifactId>
    <version>1.12.1</version>
    <executions>
        <execution>
            <id>install node and npm</id>
            <goals>
                <goal>install-node-and-npm</goal>
            </goals>
            <configuration>
                <nodeVersion>v18.17.0</nodeVersion>
                <npmVersion>9.6.7</npmVersion>
            </configuration>
        </execution>
        <execution>
            <id>npm install</id>
            <goals>
                <goal>npm</goal>
            </goals>
            <configuration>
                <arguments>install</arguments>
            </configuration>
        </execution>
        <execution>
            <id>npm build</id>
            <goals>
                <goal>npm</goal>
            </goals>
            <configuration>
                <arguments>run build</arguments>
            </configuration>
        </execution>
    </executions>
</plugin>
```

## 📚 Resources

- **Bosch Design System**: https://brandguide.bosch.com/bdds
- **Frontend Kit Documentation**: https://frok.ui.bosch.tech/documentation/how-to-use
- **Example Page**: [bosch-integration-example.html](src/main/resources/static/bosch-integration-example.html)

## 🔐 Registry Configuration

Your `.npmrc` is configured to:
- Fetch `@bosch` packages from Bosch DevCloud Artifactory
- Fetch standard packages from public npm registry
- Use proper authentication for Bosch registries

## 🚨 Next Steps

1. Update your existing HTML files ([index.html](src/main/resources/static/index.html), [admin.html](src/main/resources/static/admin.html)) to use Bosch Design System classes
2. Replace custom CSS with Bosch components where possible
3. Test the integration by running your Spring Boot application
4. Consider adding the Maven plugin for automatic builds

## 📝 Example Integration

See [bosch-integration-example.html](src/main/resources/static/bosch-integration-example.html) for a complete working example of how to use the Bosch Frontend Kit in your application.