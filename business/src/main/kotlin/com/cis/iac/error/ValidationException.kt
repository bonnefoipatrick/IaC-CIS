package com.cis.iac.error

import com.cis.iac.entity.ValidationBusinessResult

/**
 * Business Validation exception.
 *
 * @author pbonnefoi
 * Date: 18/08/2020
 */
class ValidationException(val details: Set<ValidationBusinessResult>?) : RuntimeException("Validation exception for business rules $details")