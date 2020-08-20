package com.cis.iac.entity

import com.capraro.kalidation.spec.ValidationResult

/**
 * Sealed class dealing the validation specific beans derivated from Validation.
 *
 * @author cholet
 * Date: 21/11/2018
 */
sealed class Validation

data class ValidationSurfaceResult(val fieldName: String, val message: String) : Validation()
data class ValidationBusinessResult(val code: String, val fields: Set<String>) : Validation()


/**
 * Method to map a ValidationResult from Kalidation to a specific ValidationSurfaceResult
 */
fun ValidationResult.toValidationSurfaceResult(): ValidationSurfaceResult {
    return ValidationSurfaceResult(fieldName, message)
}