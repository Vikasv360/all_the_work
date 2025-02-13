// @ts-check
const { devices, expect } = require('@playwright/test');

const config = {

  testDir: './tests',

  timeout: 30 * 1000, //Globaltimeout

  expect: {
    timeout: 5000 //Assertion timeout
  },

  reporter: 'html',

  use: {
//chromium,'firefox','webkit'
    browserName: 'firefox',
    headless : true


  }

}

module.exports = config;

