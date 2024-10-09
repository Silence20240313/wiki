module.exports = {
  root: true,
  env: {
    node: true
  },
  'extends': [
    'plugin:vue/vue3-essential',
    'eslint:recommended',
    '@vue/typescript/recommended'
  ],
  parserOptions: {
    ecmaVersion: 2020
  },
  rules: {
    'no-console': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'no-debugger': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'vue/no-unused-components': 'off',
    '@typescript-eslint/ban-ts-comment': 'off',  // 禁用不允许使用 @ts-ignore/@ts-nocheck 注释的规则
    '@typescript-eslint/no-explicit-any': 0,
    'vue/no-unused-vars': 0,
  }
}
