const defaultTheme = require('tailwindcss/defaultTheme')
module.exports = {
  mode: "jit",
  purge:
    process.env.NODE_ENV == "production"
    ? ["./public/js/main.js"]
    : ["./public/js/cljs-runtime/**/*.js"],
  future: {
    removeDeprecatedGapUtilities: true,
  },
  theme: {
  }
};