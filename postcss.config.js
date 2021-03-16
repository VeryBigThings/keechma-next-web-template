// module.exports = {
//   plugins: [
//     require('postcss-import'),
//     require('tailwindcss'),
//     require('autoprefixer'),
//   ]
// }
module.exports = {
  plugins: {
    "@tailwindcss/jit": {},
    autoprefixer: {},
    cssnano: process.env.NODE_ENV == "production" ? {} : false,
  },
};
